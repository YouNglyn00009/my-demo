package com.lyn.demo.design.pattern.template.model;

import com.lyn.common.utils.CommonUtils;
import com.lyn.demo.design.pattern.template.abstracts.AbstractExcutor;
import com.lyn.demo.design.pattern.template.index.IndexStrategy;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description
 */
public class TreeNode<DATASOURCE, VALIDATION_SERVICE extends AbstractExcutor> {

    /**
     * 索引策略
     */
    private IndexStrategy<DATASOURCE, VALIDATION_SERVICE> index;

    /**
     * 验证服务
     */
    private VALIDATION_SERVICE service;
    /**
     * 下一级索引
     */
    private Map<String, TreeNode<DATASOURCE, VALIDATION_SERVICE>> children =  new ConcurrentHashMap<String, TreeNode<DATASOURCE, VALIDATION_SERVICE>>();

    public TreeNode(IndexStrategy<DATASOURCE, VALIDATION_SERVICE> index) {
        this.index = index;
    }

    public void addTreeNode(ChooseContext<VALIDATION_SERVICE> chooseContext) {

        if (index == null) {//当前没有索引策略，说明是数据存储层
            this.service = chooseContext.getService();
        } else {
            //按照索引策略，获取当前层需要索引的key列表
            String[] keys = index.key(chooseContext);

            if (ArrayUtils.isEmpty(keys)) {//如果没有指定过滤列表，则默认全匹配
                keys = new String[] {ValidationConstants.DEFAULT_MATCH_ALL};
            }

            for (String key : keys) {
                if (StringUtils.isBlank(key)) {
                    continue;
                }
                //如果还未缓存该key，则为其生成一个节点
                if (!children.containsKey(key)) {
                    children.put(key, new TreeNode<DATASOURCE, VALIDATION_SERVICE>(index.next()));
                }
                //进行下一级索引
                children.get(key).addTreeNode(chooseContext);
            }
        }
    }

    public VALIDATION_SERVICE getService(DATASOURCE context) {
        if (index == null) {
            return this.service;
        } else {
            String key = index.key(context);

            TreeNode<DATASOURCE, VALIDATION_SERVICE> treeNode = children.get(key);

            if (treeNode != null) {
                //如果多条件下匹配不到，则用更宽松的条件匹配兜底
                VALIDATION_SERVICE service = treeNode.getService(context);
                if (service != null) {
                    return service;
                }
            }

            treeNode = children.get(ValidationConstants.DEFAULT_MATCH_ALL);

            if (treeNode != null) {
                return treeNode.getService(context);
            }
            return null;
        }
    }

    @Override
    public String toString() {

        if (MapUtils.isEmpty(children)) {
            return CommonUtils.formatClassName(this.service) + "\n";
        }

        StringBuilder builder = new StringBuilder();

        for (String key : children.keySet()) {
            for(String str : children.get(key).toString().split("\n")) {
                if (StringUtils.isBlank(str)) continue;
                builder.append(key).append("--").append(str).append("\n");
            };
        }
        return builder.toString();
    }
}

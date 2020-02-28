package com.lyn.demo.design.pattern.annonation.analizer;

import com.lyn.common.utils.CommonUtils;
import com.lyn.demo.design.pattern.template.abstracts.AbstractExcutor;
import com.lyn.demo.design.pattern.template.context.TemContext;
import com.lyn.demo.design.pattern.template.enums.ModuleEnum;
import com.lyn.demo.design.pattern.template.index.GeneralIndexStrategyFactory;
import com.lyn.demo.design.pattern.template.index.IndexStrategy;
import com.lyn.demo.design.pattern.template.model.ChooseContext;
import com.lyn.demo.design.pattern.template.model.IAMContext;
import com.lyn.demo.design.pattern.template.model.TreeNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description
 */
@Slf4j
public class ExcutorAnalizer implements ApplicationContextAware{

    /**
     * 按照模块，将参数验证器分类
     */
    private final static Map<ModuleEnum, TreeNode<IAMContext, AbstractExcutor>> cachedMap = new ConcurrentHashMap<ModuleEnum, TreeNode<IAMContext, AbstractExcutor>>();

    @Resource
    private GeneralIndexStrategyFactory generalIndexStrategyFactory;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        Map<String, AbstractExcutor> excutorMap = applicationContext.getBeansOfType(AbstractExcutor.class);

        ModuleEnum moduleValue;

        for (AbstractExcutor service : excutorMap.values()) {

            ChooseContext<AbstractExcutor> chooseContext = ChooseContext.create(service);

            moduleValue = chooseContext.getExcutor().value();

            if (log.isInfoEnabled()) {
                log.info("【模块服务持有器】【" + moduleValue.getMoudleDesc() + "】：" + CommonUtils.formatClassName(service));
            }

            if (!cachedMap.containsKey(moduleValue)) {
                IndexStrategy<IAMContext, AbstractExcutor> indexStrategy = generalIndexStrategyFactory.chooseIndexStrategy(moduleValue);
                cachedMap.put(moduleValue, new TreeNode<IAMContext, AbstractExcutor>(indexStrategy));
            }
            cachedMap.get(moduleValue).addTreeNode(chooseContext);
        }

        if (log.isInfoEnabled()) {
            StringBuilder str = new StringBuilder("【模块服务持有器】索引后的AbstractExcutor实现为：\n");
            for (ModuleEnum module : cachedMap.keySet()) {
                str.append(module + ":" + module.getMoudleDesc()).append("\n").append(cachedMap.get(module));
            }
            log.info(str.toString());
        }


    }

    public void excute(ModuleEnum moduleEnum, TemContext temContext) {
        TreeNode<IAMContext, AbstractExcutor> treeNode = cachedMap.get(moduleEnum);
        if (treeNode == null) {
            throw new IllegalStateException("【模块选择】获取模块【" + moduleEnum.getMoudleDesc() + "】无可用服务");
        }

        AbstractExcutor service = treeNode.getService(temContext);

        service.doProcessor(temContext.getUser());
    }

}

package com.lyn.demo.design.pattern.template.index;

import com.lyn.demo.design.pattern.template.enums.ModuleEnum;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description
 */
@Component
public class GeneralIndexStrategyFactory<DATASOURCE, VALIDATION_SERVICE> {

    /**
     * 模块的多级索引策略
     */
    protected final Map<ModuleEnum, IndexStrategy<DATASOURCE, VALIDATION_SERVICE>> indexMap = new ConcurrentHashMap<ModuleEnum, IndexStrategy<DATASOURCE, VALIDATION_SERVICE>>();
    /**
     * 默认只使用事业部一级索引策略
     */
    protected IndexStrategy<DATASOURCE, VALIDATION_SERVICE> defaultIndexStrategy;

    @Resource
    protected List<AbstractIndexStrategy<DATASOURCE, VALIDATION_SERVICE>> chooserHolderIndexStrategyList;

    @PostConstruct
    protected void initMethod() {

        IndexStrategy<DATASOURCE, VALIDATION_SERVICE> next = defaultIndexStrategy = null;
        for (AbstractIndexStrategy<DATASOURCE, VALIDATION_SERVICE> strategy : chooserHolderIndexStrategyList) {
            if (defaultIndexStrategy == null) {
                next = defaultIndexStrategy = strategy;
                continue;
            }
            next = setAndGetNext(next, strategy);
        }
    }
    /**
     * 获取对应模块的多级索引策略
     * @return
     */
    public IndexStrategy<DATASOURCE, VALIDATION_SERVICE> chooseIndexStrategy(ModuleEnum module) {

        IndexStrategy<DATASOURCE, VALIDATION_SERVICE> index = indexMap.get(module);
        if (index == null) {
            return defaultIndexStrategy;
        }
        return index;
    }

    protected IndexStrategy<DATASOURCE, VALIDATION_SERVICE> setAndGetNext(IndexStrategy<DATASOURCE, VALIDATION_SERVICE> current, IndexStrategy<DATASOURCE, VALIDATION_SERVICE> next) {
        current.setNext(next);
        return next;
    }

}

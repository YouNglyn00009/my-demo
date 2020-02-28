package com.lyn.demo.design.pattern.template.index;

import com.lyn.demo.design.pattern.template.model.ChooseContext;

/**
 * @Description
 */
public interface IndexStrategy<DATASOURCE, VALIDATION_SERVICE> {

    /**
     * 设置下一级索引策略
     * @param nextIndex
     */
    void setNext(IndexStrategy<DATASOURCE, VALIDATION_SERVICE> nextIndex);
    /**
     * 下一级索引策略
     * @return
     */
    IndexStrategy<DATASOURCE, VALIDATION_SERVICE> next();
    /**
     * 从选择条件中获取当前索引key，索引所有的ValidationService时使用
     * @param chooseAnnotationContext
     * @return
     */
    String[] key(ChooseContext<VALIDATION_SERVICE> chooseAnnotationContext);
    /**
     * 从当前订单信息中获取索引对应的key，从一个订单中快速定位合适的ValidationService时使用
     * @param context 数据源
     * @return
     */
    String key(DATASOURCE context);

}

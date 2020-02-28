package com.lyn.demo.design.pattern.template.model;


import com.lyn.common.utils.CommonUtils;
import com.lyn.demo.design.pattern.annonation.Excutor;
import com.lyn.demo.design.pattern.annonation.ChooseSexType;

/**
 * @Description
 */
public class ChooseContext<VALIDATION_SERVICE> {

    private Excutor excutor;

    private ChooseSexType chooseSexType;

    private VALIDATION_SERVICE service;

    public Excutor getExcutor() {
        return excutor;
    }

    public void setExcutor(Excutor excutor) {
        this.excutor = excutor;
    }

    public ChooseSexType getChooseSexType() {
        return chooseSexType;
    }

    public void setChooseSexType(ChooseSexType chooseSexType) {
        this.chooseSexType = chooseSexType;
    }

    public VALIDATION_SERVICE getService() {
        return service;
    }

    public void setService(VALIDATION_SERVICE service) {
        this.service = service;
    }

    public static <VALIDATION_SERVICE> ChooseContext<VALIDATION_SERVICE> create(VALIDATION_SERVICE service) {
        Class<?> cls = service.getClass();

        Excutor excutor = cls.getAnnotation(Excutor.class);

        if (excutor == null) {
            throw new IllegalStateException("服务：" + CommonUtils.formatClassName(service) + ", 没有指定所属模块（@Excutor）, 请检查配置");
        }

        ChooseContext<VALIDATION_SERVICE> chooseContext = new ChooseContext<VALIDATION_SERVICE>();
        chooseContext.setChooseSexType(cls.getAnnotation(ChooseSexType.class));
        chooseContext.setExcutor(excutor);
        chooseContext.setService(service);

        return chooseContext;

    }

}

package com.lyn.demo.design.pattern.annonation.analizer;

import com.lyn.common.exception.LynException;
import com.lyn.demo.design.pattern.annonation.Excutor;
import com.lyn.demo.design.pattern.template.abstracts.AbstractExcutor;
import com.lyn.demo.design.pattern.template.enums.ModuleEnum;
import com.lyn.demo.design.pattern.template.param.User;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 */
public class ExcutorAnalizer implements ApplicationContextAware{

    private Map<ModuleEnum, AbstractExcutor> excutorMap = new HashMap<ModuleEnum, AbstractExcutor>();

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        Map<String, Object> excutorAnnonationMap = applicationContext.getBeansWithAnnotation(Excutor.class);

        if (excutorAnnonationMap == null || excutorAnnonationMap.size() == 0) {
            return;
        }

        for (String excutorBeanName : excutorAnnonationMap.keySet()) {
            Object excutorObject = excutorAnnonationMap.get(excutorBeanName);

            if (!(excutorObject instanceof AbstractExcutor)) {
                throw new LynException("if use annonation Excutor," + excutorObject.getClass().getName() + " have to extend AbstractExcutor...");
            }

            AbstractExcutor excutor = (AbstractExcutor) excutorObject;

            try {
                Class<? extends AbstractExcutor> excutorClass = excutor.getClass();
                Excutor annotation = excutorClass.getAnnotation(Excutor.class);
                ModuleEnum moduleEnum = annotation.moduleName();
                excutorMap.put(moduleEnum, excutor);
            } catch (Exception e) {
                throw new LynException("init excutorContext exception...", e);
            }
        }

    }

    public void excute(ModuleEnum moduleEnum, User user) {
        AbstractExcutor excutor = excutorMap.get(moduleEnum);
        excutor.excute(user);
    }

}

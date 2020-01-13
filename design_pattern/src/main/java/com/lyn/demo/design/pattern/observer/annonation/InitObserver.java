package com.lyn.demo.design.pattern.observer.annonation;

import com.lyn.demo.design.pattern.observer.abstracts.Student;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Description
 */
@Service("initObserver")
public class InitObserver implements ApplicationContextAware {

    private Set<Student> observerSet = new HashSet<Student>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        Map<String, Object> observerBeans = applicationContext.getBeansWithAnnotation(Observer.class);

        if (observerBeans.isEmpty()) {
            return;
        }

        for (Map.Entry<String, Object> observerBean : observerBeans.entrySet()) {

            Object bean = observerBean.getValue();

            if (!(bean instanceof Student)) {
                continue;
            }
            observerSet.add((Student) bean);
        }
    }

    public Set<Student> getObserverSet() {
        return observerSet;
    }
}

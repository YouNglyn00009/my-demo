package com.lyn.demo.design.pattern.observer.impl;

import com.lyn.demo.design.pattern.observer.abstracts.Teacher;
import com.lyn.demo.design.pattern.observer.annonation.InitObserver;

/**
 * @Description 被观察者-数学老师
 */
public class MathTeacher extends Teacher {

    public MathTeacher(InitObserver initObserver) {
        super(initObserver);
    }

    @Override
    public void sendMsg(String msg) {
        super.notifyAllObserver();
    }


}

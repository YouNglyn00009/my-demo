package com.lyn.demo.design.pattern.observer.impl;

import com.lyn.demo.design.pattern.observer.abstracts.Teacher;

/**
 * @Description 被观察者-数学老师
 */
public class MathTeacher extends Teacher {

    @Override
    public void sendMsg(String msg) {
        super.notifyAllObserver(msg);
    }


}

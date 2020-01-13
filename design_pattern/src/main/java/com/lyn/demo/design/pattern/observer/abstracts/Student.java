package com.lyn.demo.design.pattern.observer.abstracts;

/**
 * @Description 抽象观察者-学生
 */
public abstract class Student {

    /**
     * 接收消息
     * @param teacher
     */
    public abstract void receiveMsg(Teacher teacher);
}

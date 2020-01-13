package com.lyn.demo.design.pattern.observer.abstracts;


import com.lyn.demo.design.pattern.observer.annonation.InitObserver;
import java.util.Set;

/**
 * @Description 抽象被观察者-老师
 */
public abstract class Teacher {

    private String teacherName;

    private Set<Student> observerSet;


    public Teacher(InitObserver initObserver) {
        this.observerSet = initObserver.getObserverSet();
    }

    /**
     * 发送消息
     * @param msg
     */
    public abstract void sendMsg(String msg);

    public void notifyAllObserver() {
        for (Student student : observerSet) {
            student.receiveMsg(this);
        }
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}

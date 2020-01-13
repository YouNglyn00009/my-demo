package com.lyn.demo.design.pattern.observer.abstracts;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description 抽象被观察者-老师
 */
public abstract class Teacher {

    private String teacherName;

    private Set<Student> observerSet = new HashSet<Student>();

    /**
     * 发送消息
     * @param msg
     */
    public abstract void sendMsg(String msg);

    public void notifyAllObserver(String msg) {
        for (Student student : observerSet) {
            student.receiveMsg(this, msg);
        }
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Set<Student> getObserverSet() {
        return observerSet;
    }

    public void setObserverSet(Set<Student> observerSet) {
        this.observerSet = observerSet;
    }
}

package com.lyn.demo.design.pattern.observer.impl;

import com.lyn.demo.design.pattern.observer.abstracts.Student;
import com.lyn.demo.design.pattern.observer.abstracts.Teacher;
import org.springframework.stereotype.Service;

/**
 * @Description 观察者-学生A
 */
public class StudentImpl extends Student {

    private String name;

    public StudentImpl(String name) {
        this.name = name;
    }

    @Override
    public void receiveMsg(Teacher teacher, String msg) {
        System.out.println(this.name + "收到了" + teacher.getTeacherName() + "发送的消息:" + msg);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

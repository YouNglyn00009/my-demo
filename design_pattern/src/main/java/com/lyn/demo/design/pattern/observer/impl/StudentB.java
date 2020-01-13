package com.lyn.demo.design.pattern.observer.impl;

import com.lyn.demo.design.pattern.observer.abstracts.Student;
import com.lyn.demo.design.pattern.observer.abstracts.Teacher;
import com.lyn.demo.design.pattern.observer.annonation.Observer;
import org.springframework.stereotype.Service;

/**
 * @Description
 */
@Observer
@Service("studentB")
public class StudentB extends Student {

    private String name = "学生B";

    @Override
    public void receiveMsg(Teacher teacher) {
        System.out.println(this.name + "收到了" + teacher.getTeacherName() + "发送的消息:" + teacher.getMsg());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

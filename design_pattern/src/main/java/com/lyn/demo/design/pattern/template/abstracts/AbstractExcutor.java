package com.lyn.demo.design.pattern.template.abstracts;

import com.lyn.demo.design.pattern.template.param.User;

/**
 * @Description
 *
 */
public abstract class AbstractExcutor {

    protected abstract void excute(User user);

    public final void doProcessor(User user) {
        excute(user);
    }

}

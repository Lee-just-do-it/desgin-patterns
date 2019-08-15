package com.desgin.patterns.builds.prototype;

/**
 * @author 木子Lee
 * @desc 浅拷贝的原型模式
 * @date 2019/8/13 22：51
 * @since 1.0
 */
public class Prototype implements Cloneable {

    private int pos;

    /**
     * 深拷贝方式不做探讨，，主要谈论原型模式
     * this.clone()方式产生复刻对象
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

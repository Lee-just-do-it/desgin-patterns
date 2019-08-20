package com.desgin.patterns.mode.flyweight;

/**
 * @author 木子Lee
 * @desc 享元模式
 * @date 2019/8/19 22：29
 * @since 1.0
 */
public abstract class Flyweight {

    protected final String exState;
    private String inState;

    public Flyweight(String exState) {
        this.exState = exState;
    }

    public abstract void execute();

    public String getInState() {
        return inState;
    }

    public void setInState(String inState) {
        this.inState = inState;
    }
}

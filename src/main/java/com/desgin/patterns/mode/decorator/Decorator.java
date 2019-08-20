package com.desgin.patterns.mode.decorator;

/**
 * @author 木子Lee
 * @desc 装饰者模式
 * @date 2019/8/20 21：55
 * @since 1.0
 */
public abstract class Decorator implements ICorator {

    protected ICorator corator;

    public Decorator(ICorator corator) {
        this.corator = corator;
    }

    @Override
    public String handle() {
        return null;
    }
}

package com.desgin.patterns.mode.istrategy;

/**
 * @author 木子Lee
 * @desc 策略模式
 *       是不是感觉像代理模式？
 * @date 2019/8/19 22；12
 * @since 1.0
 */
public class Context {

    private Istrategy istrategy;

    public Context(Istrategy istrategy) {
        this.istrategy = istrategy;
    }

    public void execute() {
        istrategy.execute();
    }
}

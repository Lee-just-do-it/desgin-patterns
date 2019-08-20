package com.desgin.patterns.mode.chain;

/**
 * @author 木子Lee
 * @desc 责任链模式
 * @date 2019/8/20 23：09
 * @since 1.0
 */
public abstract class AbstarctPayHandler<T, E> {

    /**
     * 下一个责任链
     */
    protected AbstarctPayHandler next;

    /**
     * 设置下个路由支付对象
     *
     * @param nextHandler
     */
    public void set(AbstarctPayHandler nextHandler) {
        this.next = nextHandler;
    }

    /**
     * 抽象传递路路由
     *
     * @param e 支付参数
     * @return
     */
    public abstract T handlePay(E e);

}

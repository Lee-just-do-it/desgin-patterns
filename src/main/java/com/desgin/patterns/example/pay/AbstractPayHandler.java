package com.desgin.patterns.example.pay;

/**
 * @author 木子Lee
 * @desc 抽象责任链
 * @date 2019/8/13 23：04
 * @since 1.0
 */
public abstract class AbstractPayHandler<T, E, R> {

    /**
     * 下一个责任链
     */
    protected AbstractPayHandler next;

    /**
     * 设置下个路由支付对象
     *
     * @param nextHandler
     */
    public void set(AbstractPayHandler nextHandler) {
        this.next = nextHandler;
    }

    /**
     * 抽象传递路路由
     *
     * @param e      支付参数
     * @param payway 下个路由参数
     * @return
     */
    public abstract T handlePay(E e, R payway);

}

package com.desgin.patterns.pay;

/**
 * @author 木子Lee
 * @desc 支付接口
 * @date 2018/8/13 23:15
 * @since 1.0
 */
@FunctionalInterface
public interface PayService<T> {
    /**
     * 支付接口
     * @param t
     */
    void pay(T t);
}

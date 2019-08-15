package com.desgin.patterns.example.pay;

/**
 * @author 木子Lee
 * @desc 支付路由
 * @date 2019/8/13 23：18
 * @since 1.0
 */
@FunctionalInterface
public interface RouteService<T> {

    /**
     * 对接路由
     *
     * @param t
     */
    void route(T t);
}

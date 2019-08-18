package com.desgin.patterns.mode.template;

/**
 * @author 木子Lee
 * @desc 抽象模版  简单的支付验证流程
 * @date 2019/8/18 15：40
 * @since 1.0
 */
public abstract class AbstractTemplate {

    /**
     * 基本方法
     */
    protected abstract void sign();

    /**
     * 基本方法
     */
    protected abstract void change();

    /**
     * 基本方法
     */
    protected abstract void pay();

    /**
     * 模版方法
     */
    protected void defray() {
        sign();
        pay();
        change();
    }
}

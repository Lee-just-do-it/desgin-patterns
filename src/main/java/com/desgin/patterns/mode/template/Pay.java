package com.desgin.patterns.mode.template;

/**
 * @author 木子Lee
 * @desc 抽象模版
 * @date 2019/8/18 15：40
 * @since 1.0
 */
public class Pay extends AbstractTemplate {

    @Override
    protected void sign() {
        System.out.println("参数验证通过...");
    }

    @Override
    protected void change() {
        System.out.println("状态改变...");
    }

    @Override
    protected void pay() {
        System.out.println("支付成功...");
    }

    static class Test {
        public static void main(String[] args) {
            new Pay().defray();
        }
    }
}

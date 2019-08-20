package com.desgin.patterns.mode.chain;

/**
 * @author 木子Lee
 * @desc 责任链模式
 * @date 2019/8/20 23：09
 * @since 1.0
 */
public class TestHandler extends AbstarctPayHandler<String, String> {
    @Override
    public String handlePay(String s) {
        if (s.equals("")) {
            System.out.println("支付路由ccb");
            return s;
        }
        if (next == null) {
            return s;
        }
        next.handlePay(s);
        return s;
    }
}

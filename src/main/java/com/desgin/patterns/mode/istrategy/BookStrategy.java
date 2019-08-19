package com.desgin.patterns.mode.istrategy;

/**
 * @author 木子Lee
 * @desc 策略模式
 * @date 2019/8/19 22；12
 * @since 1.0
 */
public class BookStrategy implements Istrategy {
    @Override
    public void execute() {
        System.out.println("book strategy");
    }
}

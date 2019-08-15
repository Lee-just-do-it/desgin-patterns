package com.desgin.patterns.builds.factory;

/**
 * @author 木子Lee
 * @desc 抽象工厂
 * @date 2019/8/13 13：31
 * @since 1.0
 */
public class ShippingBuild implements Build {
    @Override
    public void build() {
        System.out.println("shipping build");
    }
}

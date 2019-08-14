package com.desgin.patterns.factory;

/**
 * @author 木子Lee
 * @desc 抽象工厂
 * @date 2019/8/13 13：31
 * @since 1.0
 */
public class HouseBuild implements Build {
    @Override
    public void build() {
        System.out.println("house build");
    }
}

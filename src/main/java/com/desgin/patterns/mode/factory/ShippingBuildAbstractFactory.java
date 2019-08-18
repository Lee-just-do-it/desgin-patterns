package com.desgin.patterns.mode.factory;

/**
 * @author 木子Lee
 * @desc 抽象工厂（多个工厂）
 * @date 2019/8/13 13：31
 * @since 1.0
 */
public class ShippingBuildAbstractFactory extends AbstractBuildFactory {
    @Override
    public Build build() {
        return new ShippingBuild();
    }
}

package com.desgin.patterns.mode.factory;

/**
 * @author 木子Lee
 * @desc 抽象工厂 （多个工厂）
 * 方便扩展，，建议使用接口的方式更好，，，
 * 此处建立抽象类是为了说明 抽象的概念
 * <p>
 * 优点：
 * 增加其他的build,只需要增加build实现 和 建造一个对应的工程类，，而不需要修改原本的逻辑代码
 * 增加了 扩展性
 * @date 2019/8/13 13：30
 * @since 1.0
 */
public abstract class AbstractBuildFactory {
    /**
     * 抽象的工厂建造
     *
     * @return
     */
    public abstract Build build();
}

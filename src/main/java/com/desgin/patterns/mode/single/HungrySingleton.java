package com.desgin.patterns.mode.single;

/**
 * @author 木子Lee
 * @desc 线程安全的饿汉模式
 * @date 2019/8/18 15：40
 * @since 1.0
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    /**
     * 构造器私有化，防止其他类通过构造器直接构创建实例
     */
    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}

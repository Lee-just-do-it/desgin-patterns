package com.desgin.patterns.mode.single;

/**
 * @author 木子Lee
 * @desc 线程不安全的懒汉模式
 * @date 2019/8/13 22：23
 * @since 1.0
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    /**
     * 低并发没有问题
     * 对于高并发情况下，可能出现多个实例
     * 请结合多线程知识自行分析，指令重排序的知识
     *
     * @return
     */
    public static LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

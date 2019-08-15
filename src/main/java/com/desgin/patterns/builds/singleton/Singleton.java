package com.desgin.patterns.builds.singleton;

/**
 * @author 木子Lee
 * @desc 线程安全的静态内部类模式（推荐）
 * @date 2019/8/13 22：32
 * @since 1.0
 */
public class Singleton {

    /**
     * 1.内部类满足需要才加载，即懒加载模式
     * 2.内部类保证只有一份
     * 3.结合jvm类加载机制理解
     *
     * @return
     */
    private Singleton getInstance() {
        return SingletonHodler.INSTANCE;
    }

    private static class SingletonHodler {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * <p>思考：克隆可以破坏单例吗 ？</p>
     */
}

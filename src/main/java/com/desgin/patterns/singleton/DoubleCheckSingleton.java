package com.desgin.patterns.singleton;

/**
 * @author 木子Lee
 * @desc  线程N/Y安全的双重检测模式
 * @date  2019/8/13 22：29
 * @since 1.0
 */
public class DoubleCheckSingleton {

    private static DoubleCheckSingleton instancce = null;

    private static volatile DoubleCheckSingleton instancceV = null;

    private DoubleCheckSingleton() {}

    /**
     * 不安全原因，请结合jvm类加载机制，以及jvm的指令重排序分析
     * @return
     */
    public static DoubleCheckSingleton getInstance() {
        if (null == instancce) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == instancce) {
                    instancce = new DoubleCheckSingleton();
                }
            }
        }
        return instancce;
    }

    /**
     * 这个为什么是安全的检测，请结合多线程知识自行分析
     * @return
     */
    public static DoubleCheckSingleton getInstanceV() {
        if (null == instancceV) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == instancceV) {
                    instancceV = new DoubleCheckSingleton();
                }
            }
        }
        return instancceV;
    }
}

package com.desgin.patterns.mode.factory.relpace;

import com.desgin.patterns.mode.factory.method.AbstractCarFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;

/**
 * @author 木子Lee
 * @desc 工厂替代单例
 * @date 2019/8/18 22：22
 * @since 1.0
 */
public class SingletonFactory {

    private static Logger log = LoggerFactory.getLogger(AbstractCarFactory.class);

    private static Singleton singleton = null;

    static {
        try {
            Class<?> c = Class.forName(Singleton.class.getName());
            Constructor<?> constructor = c.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance(Singleton.class);
        } catch (Exception e) {
            log.error("class not found[{}]", e);
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }

    /**
     * 单例可以有延迟加载，，，既然工厂可以替代单例，，，是不是也应该有延迟加载工厂？？？
     * 这里不给出实现，，读者可以自行思考实现：
     * 思考工厂的线程安全和线程不安全的实现
     */
}

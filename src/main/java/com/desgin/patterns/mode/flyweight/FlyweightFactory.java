package com.desgin.patterns.mode.flyweight;

import java.util.HashMap;

/**
 * @author 木子Lee
 * @desc 享元模式
 * @date 2019/8/19 22：29
 * @since 1.0
 */
public class FlyweightFactory {

    private static HashMap<String, Flyweight> pool = new HashMap<>();

    public static Flyweight get(String exState) {
        Flyweight flyweight = null;
        if (pool.containsKey(exState)) {
            flyweight = pool.get(exState);
        } else {
            flyweight = new ConFlyweight(exState);
            pool.put(exState, flyweight);
        }
        return flyweight;
    }
}

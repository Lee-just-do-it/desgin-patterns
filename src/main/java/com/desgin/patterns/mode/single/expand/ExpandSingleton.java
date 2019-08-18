package com.desgin.patterns.mode.single.expand;

import java.security.SecureRandom;
import java.util.ArrayList;

/**
 * @author 木子Lee
 * @desc 内存中如何产生指定数量的实例
 * @date 2019/8/18 21：32
 * @since 1.0
 */
public class ExpandSingleton {

    private static final int max = 2;
    private static final ArrayList<ExpandSingleton> INSTANCE = new ArrayList<>(max);
    private static int seq = 0;

    static {
        for (int i = 0; i < max; i++) {
            INSTANCE.add(new ExpandSingleton());
        }
    }

    private ExpandSingleton() {
    }

    public static ExpandSingleton getInstance() {
        SecureRandom random = new SecureRandom();
        seq = random.nextInt(max);
        return INSTANCE.get(seq);
    }

    public static void main(String[] args) {
        ExpandSingleton e = ExpandSingleton.getInstance();
        for (int i = 0; i < max; i++) {
            e.say(i);
        }
    }

    private void say(int i) {
        System.out.println(INSTANCE.get(i));
    }
}

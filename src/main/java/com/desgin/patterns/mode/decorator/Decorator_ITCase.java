package com.desgin.patterns.mode.decorator;

/**
 * @author 木子Lee
 * @desc 装饰者模式
 * @date 2019/8/20 21：55
 * @since 1.0
 */
public class Decorator_ITCase {
    public static void main(String[] args) {
        ICorator corator = new JSCorator(new HeaderCorator(new HttpHeaderCorator()));
        System.out.println(corator.handle());
    }
}

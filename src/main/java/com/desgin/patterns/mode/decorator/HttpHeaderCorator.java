package com.desgin.patterns.mode.decorator;

/**
 * @author 木子Lee
 * @desc 装饰者模式
 * @date 2019/8/20 21：55
 * @since 1.0
 */
public class HttpHeaderCorator implements ICorator {
    @Override
    public String handle() {
        return "核心数据，没有格式";
    }
}

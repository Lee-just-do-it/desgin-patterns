package com.desgin.patterns.mode.decorator;

/**
 * @author 木子Lee
 * @desc 装饰者模式
 * @date 2019/8/20 21：55
 * @since 1.0
 */
public class HeaderCorator extends Decorator {
    public HeaderCorator(ICorator corator) {
        super(corator);
    }

    @Override
    public String handle() {
        StringBuffer sb = new StringBuffer();
        sb.append("七七八八的");
        sb.append(corator.handle());
        return sb.toString();
    }
}

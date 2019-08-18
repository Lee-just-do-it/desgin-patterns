package com.desgin.patterns.mode.build;


/**
 * @author 木子Lee
 * @desc 建造者模式：具有扩展性的要什么就给什么
 * <p>
 * 假设某个类很多的属性，，又需要很多的构造器提供不同的参数赋值，，显得繁琐，不知道该用那个构造器类型
 * 这里用建造者模式 替换  众多的需要构造器的场景
 * <p>
 * 关注：顺序和类型产生不同的结果
 * @date 2019/8/18 16：04
 * @since 1.0
 */
public class CB extends AbstractPayTemplate {
    @Override
    protected void sign() {
        System.out.println("cb sign....");
    }

    @Override
    protected void defray() {
        System.out.println("cb defray....");
    }
}

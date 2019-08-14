package com.desgin.patterns.factory;

/**
 * @author 木子Lee
 * @desc 多个普通单工厂 替换单个普通工厂
 * 存在问题：
 * 违反 开闭原则，没新增一个就需要修改原本的代码
 * 静态工厂也是如此 违反开闭原则
 * @date 2019/8/13 13：24
 * @since 1.0
 */
public class GeneralMuiltFactory {

    public /*static*/ Build buildHouse() {
        return new HouseBuild();
    }

    public /*static*/ Build buildShipping() {
        return new ShippingBuild();
    }
}

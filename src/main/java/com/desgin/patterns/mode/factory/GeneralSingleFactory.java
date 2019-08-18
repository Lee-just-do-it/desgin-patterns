package com.desgin.patterns.mode.factory;

/**
 * @author 木子Lee
 * @desc 普通单工厂
 * @date 2019/8/13 13：16
 * @since 1.0
 */
public class GeneralSingleFactory {
    /**
     * 存在的问题：
     * 违反 开闭原则
     * 类型type篡改后就找不到对应的实现
     *
     * @param type
     * @return
     */
    public Build build(String type) {
        if (FactoryConstants.HOUSE.equals(type)) {
            return new HouseBuild();
        }
        if (FactoryConstants.SHIPPING.equals(type)) {
            return new ShippingBuild();
        }
        return null;
    }
}

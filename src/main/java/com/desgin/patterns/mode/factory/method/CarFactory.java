package com.desgin.patterns.mode.factory.method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 木子Lee
 * @desc 工厂方法(简单工厂)
 * @date 2019/8/18 22：04
 * @since 1.0
 */
public class CarFactory extends AbstractCarFactory {

    private Logger log = LoggerFactory.getLogger(AbstractCarFactory.class);

    public static void main(String[] args) {
        AbstractCarFactory factory = new CarFactory();
        Bwm bwm = factory.create(Bwm.class);
        bwm.run();
    }

    @Override
    protected <T extends Car> T create(Class<T> c) {
        Car car = null;
        try {
            car = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            log.error("class is not found【{{}】", e);
        }
        return (T) car;
    }
}

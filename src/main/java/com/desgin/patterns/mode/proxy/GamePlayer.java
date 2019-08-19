package com.desgin.patterns.mode.proxy;

/**
 * @author 木子Lee
 * @desc 代理模式
 * @date 2019/8/19 21：29
 * @since 1.0
 */
public class GamePlayer implements IGame {
    @Override
    public void killBoss() {
        System.out.println("kill boss proxy....");
    }

    @Override
    public void KillSoldiers() {
        System.out.println("kill soldiers proxy....");
    }
}

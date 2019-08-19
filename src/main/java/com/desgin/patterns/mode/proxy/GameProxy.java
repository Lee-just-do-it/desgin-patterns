package com.desgin.patterns.mode.proxy;

/**
 * @author 木子Lee
 * @desc 代理模式
 * @date 2019/8/19 21：29
 * @since 1.0
 */
public class GameProxy implements IGame {

    private IGame iGame;

    public GameProxy(IGame iGame) {
        this.iGame = iGame;
    }

    @Override
    public void killBoss() {
        iGame.killBoss();
    }

    @Override
    public void KillSoldiers() {
        iGame.KillSoldiers();
    }
}

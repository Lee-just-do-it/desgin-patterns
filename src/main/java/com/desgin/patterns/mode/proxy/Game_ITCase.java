package com.desgin.patterns.mode.proxy;

/**
 * @author 木子Lee
 * @desc 代理模式测试
 * @date 2019/8/19 21：29
 * @since 1.0
 */
public class Game_ITCase {
    public static void main(String[] args) {
        IGame iGame = new GamePlayer();
        GameProxy gameProxy = new GameProxy(iGame);
        gameProxy.killBoss();
        gameProxy.KillSoldiers();
    }
}

package com.desgin.patterns.example.pc;

import java.security.SecureRandom;
import java.util.concurrent.BlockingDeque;

/**
 * @author 木子Lee
 * @desc 消费者
 * @date 2019/8/15 22：47
 * @since 1.0
 */
public class Consumer implements Runnable {

    private BlockingDeque<PCData> queue;
    private static final int SLEEP = 2000;

    public Consumer(BlockingDeque<PCData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        SecureRandom random = new SecureRandom();
        while (true) {
            try {
                PCData data = queue.take();
                if (null != data) {
                    int sum = data.getData() * data.getData();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}

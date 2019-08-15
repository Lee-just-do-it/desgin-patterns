package com.desgin.patterns.example.pc;

import com.sun.xml.internal.bind.v2.runtime.output.Pcdata;

import java.security.SecureRandom;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author 木子Lee
 * @desc 生产者
 * @date 2019/8/15 22：26
 * @since 1.0
 */
public class Producer implements Runnable {

    private volatile boolean isRunning = true;
    private BlockingDeque<Pcdata> queue;

    private static final int SLEEP = 2000;

    private static LongAdder count = new LongAdder();

    public Producer(BlockingDeque<Pcdata> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        PCData data = null;
        SecureRandom random = new SecureRandom();
        System.out.println("start..." + Thread.currentThread().getId() + "@#" + Thread.currentThread().getName());
        while (isRunning) {
            try {
                Thread.sleep(random.nextInt(SLEEP), 1);
                data = new PCData(count.hashCode());
                if (!queue.offer(data, 2, TimeUnit.SECONDS)) {
                    System.out.println("");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stop() {
        isRunning = false;
    }
}

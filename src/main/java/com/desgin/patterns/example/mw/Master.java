package com.desgin.patterns.example.mw;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author 木子Lee
 * @desc 主线程
 * @date 2019/8/15 22：07
 * @since1.0
 */
public class Master {

    protected Queue<Object> queue = new ConcurrentLinkedQueue<>();
    protected Map<String, Thread> threadMap = new HashMap<>();
    protected Map<String, Object> resultMap = new ConcurrentHashMap<>();

    public Map<String, Object> getResultMap() {
        return resultMap;
    }

    /**
     * 判断子任务是否都已经完成
     *
     * @return
     */
    public boolean compelte() {
        boolean result = true;
        for (Map.Entry<String, Thread> entry : threadMap.entrySet()) {
            if (entry.getValue().getState() != Thread.State.TERMINATED) {
                result = false;
            }
        }
        return result;
    }

    public Master(Worker worker, int count) {
        worker.setWorkQueue(queue);
        worker.setResultMap(resultMap);

        for (int i = 0; i < count; i++) {
            threadMap.put(Integer.toString(i), new Thread(worker, Integer.toString(i)));
        }
    }

    /**
     * 提交任务
     *
     * @param o
     */
    public void submit(Object o) {
        queue.add(o);
    }

    /**
     * 启动worker
     */
    public void execute() {
        for (Map.Entry<String, Thread> entry : threadMap.entrySet()) {
            entry.getValue().start();
        }
    }

}

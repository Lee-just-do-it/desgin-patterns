package com.desgin.patterns.example.mw;

import java.util.Map;
import java.util.Queue;

/**
 * @author 木子Lee
 * @desc 工作线程
 * @date 2019/8/15 22：24
 * @since 1.0
 */
public class Worker implements Runnable {

    protected Queue<Object> workQueue;
    protected Map<String, Object> resultMap;


    public void setWorkQueue(Queue<Object> workQueue) {
        this.workQueue = workQueue;
    }

    public void setResultMap(Map<String, Object> resultMap) {
        this.resultMap = resultMap;
    }

    public Object handle(Object obj) {
        return obj;
    }

    @Override
    public void run() {
        while (true) {
            Object poll = workQueue.poll();
            if (poll == null) {
                break;
            }
            Object o = handle(poll);
            resultMap.put(Integer.toString(poll.hashCode()), o);
        }
    }
}

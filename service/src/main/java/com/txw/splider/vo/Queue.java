package com.txw.splider.vo;

import java.util.LinkedList;

/**
 * Created by tangxiewen on 2017/3/22.
 */
public class Queue {
    private LinkedList queue = new LinkedList();
    //入队列
    public void enQueue(Object t){
        queue.addLast(t);
    }
    //出队列
    public Object deQueue(){
        return queue.removeFirst();
    }
    //判断队列是否为空
    public boolean isQueueEmpty(){
        return queue.isEmpty();
    }

    public boolean contain(Object t){
        return queue.contains(t);
    }


}

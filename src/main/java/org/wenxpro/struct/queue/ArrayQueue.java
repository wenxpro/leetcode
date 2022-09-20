package org.wenxpro.struct.queue;

//数组实现队列
public class ArrayQueue {

    //数组
    private String[] items;
    //数组大小
    private int n;
    //队头
    private int head = 0;
    //队尾
    private int tail = 0;

    public ArrayQueue(int capacity){
        items = new String[capacity];
        n = capacity;
    }

    //入队
    public boolean enqueue(String item){
        if (tail == 0) return false;
        item[tail] = item;
        ++tail;
        return true;
    }

    //出队
    public String dequeue(){
        if (head == tail) return null;
        String ret = items[head];
        ++head;
        return ret;
    }
}

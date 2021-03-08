package org.wenxpro.stack;

import java.util.ArrayList;

//数组实现栈
public class ArrayStack {
    //数组
    private String[] items;
    //元素个数
    private int count;
    //栈的大小
    private int n;

    public ArrayStack(int n){
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    public boolean push(String item){
        if (count == n) return false;
        item[count] = item;
        count++;
        return true;
    }

    public String pop(){
        if (count == 0) return null;
        String tmp = items[count - 1];
        --count;
        return tmp;
    }
}

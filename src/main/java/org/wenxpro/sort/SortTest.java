package org.wenxpro.sort;

public class SortTest {

    /**
     * 冒泡排序
     * @param a
     * @param n
     * @return
     */
    public void bubbleSort(int[] a,int n){
        if(n <= 1) return;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n-i-1; j++) {
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;
                }
            }
            if (!flag) return;
        }
    }


    /**
     * 插入排序
     * @param a
     * @param n
     */
    public void insertSort(int[] a,int n){
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int value = a[i];
            int j = i -1;
            for(;j>=0;--j){
                if (a[j] >= value){
                    //数据移动
                    a[j+1] = a[j];
                }else {
                    break;
                }
            }
            //插入数据
            a[j+1] = value;
        }
    }

    /**
     * 选择排序
     * @param a
     * @param n
     */
    public void selectSort(int[] a,int n){
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int min = i;
            // 每轮需要比较的次数 N-i
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    // 记录目前能找到的最小值元素的下标
                    min = j;
                }
            }
            // 将找到的最小值和i位置所在的值进行交换
            if (i != min) {
                int tmp = a[i];
                a[i] = a[min];
                a[min] = tmp;
            }

        }
    }
}

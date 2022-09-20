package org.wenxpro.leetcode.easy.回文数;

public class Solution {

    /**
     * 回文数 转string
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        String s = new StringBuilder(x+"").reverse().toString();
        return s.equals(x+"");
    }

    /**
     * 回文数 首尾对比法
     * @param x
     * @return
     */
    public boolean isPalindrome1(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;
        int num = 1;
        while (x/num >= 10) num*=10;
        while (x > 0){
            if(x/num != x%10) return false;
            else {
                x%=num;
                x/=10;
                num/=100;
            }
        }
        return true;
    }

    /**
     * 回文字 对折法
     * @param x
     * @return
     */
    public boolean isPalindrome2(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        //设置一个reverse
        int reverse = 0;
        //给定x > reverse x退位 reverse 进位
        while (x > reverse){
            // 给定25652
            //每次给原数的末尾 第一次 为2 第二次为 25
            reverse = reverse*10 + x%10;
            //每次少末尾 第一次 2565 第二次256
            x/=10;
        }
        //x==reverse 偶数 x==reverse/10 奇数
        return x==reverse || x==reverse/10;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(121));

        System.out.println(new Solution().isPalindrome1(2552));

        System.out.println(new Solution().isPalindrome2(38683));

    }

}

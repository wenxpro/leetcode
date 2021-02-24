package org.wenxpro.linked.palindrome;

import org.wenxpro.MyUtil;
import org.wenxpro.linked.ListNode;

import java.util.Stack;

public class Solution {

    /**
     * 验证回文链表 尾插法
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        //逆向

        return true;
    }

    /**
     * 验证回文链表 借助栈实现
     * @param head
     * @return
     */
    public boolean isPalindrome1(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        while (head != null){
            stack.add(head.val);
            head = head.next;
        }
        while (node != null){
            if(node.val == stack.pop()){
                node = node.next;
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {



        boolean bool = new Solution().isPalindrome1(MyUtil.arrayToListNode(new int[]{1,2,3,2,1}));
        System.out.println(bool);
    }
}

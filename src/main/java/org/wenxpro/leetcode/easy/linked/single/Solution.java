package org.wenxpro.leetcode.easy.linked.single;


import org.wenxpro.leetcode.easy.linked.ListNode;

public class Solution {

    /**
     * 单向链表反转
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        //空链
        if(head == null){
            return null;
        }
        //新链
        ListNode header = new ListNode(0);
        ListNode cur;
        while (true){
            //当前链
            cur = new ListNode(head.val);
            cur.next = header.next;
            header.next = cur;
            if(head.next != null){
                head = head.next;
                continue;
            }
            break;
        }
        return header.next;
    }

}

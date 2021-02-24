package org.wenxpro.linked.cycle;

import org.wenxpro.linked.ListNode;



public class Solution {

    /**
     * 单向链表检测环
     * @param head
     * @return
     */
    public boolean detectCycle(ListNode head) {
        ListNode fastNode = head;
        ListNode slowNode = head;
        while (fastNode!= null && fastNode.next!= null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if(fastNode == slowNode){
                return true;
            }
        }
        return false;
    }


}

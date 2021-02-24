package org.wenxpro.linked.delete;

import org.wenxpro.MyUtil;
import org.wenxpro.linked.ListNode;

import java.util.LinkedList;

public class Solution {

    /**
     * 删除单向链表中倒数第k个节点
     * @param head
     * @param k
     * @return
     */
    public ListNode deleteKthFromEnd(ListNode head, int k) {
        //转list记下标
        LinkedList<Integer> linkedList = new LinkedList<>();
        while (head!= null){
            linkedList.add(head.val);
            head = head.next;
        }
        //删除标记节点
        linkedList.remove(linkedList.size() - k);
        //转回单向链
        head = new ListNode(linkedList.get(0));
        ListNode other = head;
        for (int i = 1; i < linkedList.size(); i++) {
            ListNode temp = new ListNode(linkedList.get(i));
            other.next = temp;
            other = temp;
        }
        return head;
    }

    /**
     * 删除某个节点
     * @param head
     * @param val
     * @return
     */
    public ListNode deleteNode(ListNode head, int val) {
        //链头
        ListNode node = head;
        //单个
        if(node.val == val){
            return head.next;
        }
        while (head.next != null){
            if(head.next.val == val){
                head.next = head.next.next;
                break;
            }
            head = head.next;
        }
        return node;
    }

    /**
     * 删除 中间节点
     * @param node
     */
    public void deleteMidNode(ListNode node) {
        ListNode oneNode = node;
        ListNode twoNode = node.next;
        while (twoNode != null ){
            oneNode = oneNode.next;
            twoNode = twoNode.next.next;
            if(twoNode.next == null){
                oneNode.next = oneNode.next.next;
                break;
            }
        }
    }

    public static void main(String[] args) {
        ListNode node = new Solution().deleteNode(
                MyUtil.arrayToListNode(new int[]{1,2,3,4,5}),3);
        MyUtil.print(node);

    }
}

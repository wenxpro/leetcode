package org.wenxpro.struct;

import org.wenxpro.struct.linked.ListNode;


public class MyUtil {

    public static ListNode arrayToListNode(int[] s) {
        ListNode root = new ListNode(s[0]);
        ListNode other = root;
        for (int i = 1; i < s.length; i++) {
            ListNode temp = new ListNode(s[i]);
            other.next = temp;
            other = temp;
        }
        return root;
    }

    public static void print(ListNode listNode){
        ListNode printNode = listNode;
        while (printNode!=null){
            System.out.println(printNode.val);
            printNode = printNode.next;
        }
    }
}

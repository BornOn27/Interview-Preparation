package main.problemsByPattern.inPlaceReversalOfLinkedList;

import main.helper.listNode.ListNode;
import main.helper.listNode.ListNodeHelper;

public class LC_0019_RemoveNthNodeFromEndOfList {

    //Question Link - https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    //Corner Case - Removing First-Node

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head = ListNodeHelper.createList(arr);
        ListNodeHelper.PrintList(head);

        ListNode result = new LC_0019_RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 5);
        ListNodeHelper.PrintList(result);

    }

    /**
     * Handled corner case by comparing,
     * if
     *      - current-pointer is null, first node to be removed
     * else
     *      - Remove slow+1 node
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c = n;
        ListNode fast = head;
        while (c-- > 0){
            fast = fast.next;
        }

        if(fast == null){
            head = head.next;
            return head;
        }

        ListNode slow = head;
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}

package main.problemsByPattern.inPlaceReversalOfLinkedList;

import main.helper.listNode.ListNode;
import main.helper.listNode.ListNodeHelper;

public class LC_0086_PartitionList {

    //Question Link - https://leetcode.com/problems/partition-list/
    public static void main(String[] args) {
        int[] arr = {2,1};
        ListNode list = ListNodeHelper.createList(arr);

        ListNode result = new LC_0086_PartitionList().partition(list, 2);
        ListNodeHelper.printList(result);
    }

    //Corner Cases - MAX[list] <= Value <= MIN[list]
    public ListNode partition(ListNode head, int x) {
        if(head == null)
            return null;

        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);

        ListNode temp = head, t1 = l1, t2 = l2;

        while (temp != null){
            if(temp.val < x){
                t1.next = temp;
                t1 = t1.next;
            }
            else {
                t2.next = temp;
                t2 = t2.next;
            }

            temp = temp.next;
        }
        t1.next = l2.next;
        t2.next = null;

        return l1.next;
    }
}

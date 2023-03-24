package main.problemsByPattern.inPlaceReversalOfLinkedList;

import main.helper.listNode.ListNode;
import main.helper.listNode.ListNodeHelper;

public class LC_0092_ReverseLinkedList {

    //Question Link - https://leetcode.com/problems/reverse-linked-list-ii/
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode list = ListNodeHelper.createList(arr);

        ListNode result = new LC_0092_ReverseLinkedList().reverseBetween(list, 2, 4);
        ListNodeHelper.printList(result);
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null)
            return head;
        if(left == right)
            return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = null, curr = dummy, next;
        ListNode leftP = null, leftN = null;
        int count = 0;

        while (count < left){
            prev = curr;
            curr = curr.next;
            count++;
        }
//        System.out.println(curr.val+" "+prev.val);
        leftP = prev;
        leftN = curr;

        prev = curr;
        curr = curr.next;
        count++;
        while (count <= right){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        leftP.next = prev;
        leftN.next = curr;

        return dummy.next;
    }

}

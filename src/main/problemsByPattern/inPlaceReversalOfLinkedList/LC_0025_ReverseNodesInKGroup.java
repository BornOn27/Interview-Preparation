package main.problemsByPattern.inPlaceReversalOfLinkedList;

import main.helper.listNode.ListNode;
import main.helper.listNode.ListNodeHelper;

public class LC_0025_ReverseNodesInKGroup {

    //Question Link - https://leetcode.com/problems/reverse-nodes-in-k-group/
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        ListNode list = ListNodeHelper.createList(arr);

        ListNode result = new LC_0025_ReverseNodesInKGroup().reverseKGroup(list, 3);
        ListNodeHelper.printList(result);
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1)
            return head;

        ListNode temp = head;
        int count = 1;
        while (count != k && temp.next != null){
            count++;
            temp = temp.next;
        }
        //Returning Early as last group-nodes < k
        if(count != k)
            return head;

        ListNode p = head, cur = head.next, next = null;
        count = 2;
        while (count <= k){
            next = cur.next;
            cur.next = p;
            p = cur;
            cur = next;
            count++;
        }

        head.next = reverseKGroup(cur, k);

        return p;
    }
}

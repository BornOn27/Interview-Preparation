package archieved.problemsByPattern.inPlaceReversalOfLinkedList;

import archieved.helper.listNode.ListNode;
import archieved.helper.listNode.ListNodeHelper;

public class LC_0082_RemoveDuplicatesFromSortedList {

    //Question Link - https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,3,3};
        ListNode list = ListNodeHelper.createList(arr);

        ListNode result = new LC_0082_RemoveDuplicatesFromSortedList().deleteDuplicates(list);
        ListNodeHelper.printList(result);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode dummy = new ListNode(-1);
        ListNode cur = head, temp, result = dummy;

        while (cur != null){
            if(cur.next != null && cur.val == cur.next.val){
                temp = cur.next;

                //Skipping all duplicate code
                while (temp != null && temp.val == cur.val)
                    temp = temp.next;

                //Updating new node as current to check the duplicate-iteration
                cur = temp;
            }
            else {
                //Unique Node found
                result.next = cur;
                cur = cur.next;
                result = result.next;

                //We need to reset the reference, else would point to main-node
                result.next = null;
            }
        }

        return dummy.next;
    }
}

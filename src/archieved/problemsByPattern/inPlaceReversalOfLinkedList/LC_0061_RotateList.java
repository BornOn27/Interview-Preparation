package archieved.problemsByPattern.inPlaceReversalOfLinkedList;

import archieved.helper.listNode.ListNode;
import archieved.helper.listNode.ListNodeHelper;

public class LC_0061_RotateList {

    //Question Link - https://leetcode.com/problems/rotate-list/
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        ListNode list = ListNodeHelper.createList(arr);

        ListNode result = new LC_0061_RotateList().rotateRight(list,100);
        ListNodeHelper.printList(result);
    }

    /**
     *  Corner cases
     *      - When k > list.size()
     *  Used solution pattern
     *      - Used fixed-distant slow-fast pointer to update references
     */
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0)
            return head;
        ListNode temp = head, slow = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }

        int rot = k % count;
        temp = head;
        count = 0;

        while (count++ < rot){
            temp = temp.next;
        }

        while (temp.next != null){
            temp = temp.next;
            slow = slow.next;
        }

        temp.next = head;
        head = slow.next;
        slow.next = null;

        return head;
    }
}

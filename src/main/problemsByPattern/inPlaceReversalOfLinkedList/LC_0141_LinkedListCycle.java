package main.problemsByPattern.inPlaceReversalOfLinkedList;

import main.helper.listNode.ListNode;
import main.helper.listNode.ListNodeHelper;

public class LC_0141_LinkedListCycle {
    public static void main(String[] args) {
        int[] arr = {3,2,0,-4};
        ListNode list = ListNodeHelper.createListWithLoop(arr, 1);

        System.out.println(new LC_0141_LinkedListCycle().hasCycle(list));
    }

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null && slow != fast){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast == null || fast.next == null)
            return false;

        return true;
    }
}

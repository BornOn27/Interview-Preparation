package archieved.problemsByPattern.inPlaceReversalOfLinkedList;

import archieved.helper.listNode.ListNode;
import archieved.helper.listNode.ListNodeHelper;

public class LC_0024_SwapNodesInPairs {

    //Question Link - https://leetcode.com/problems/swap-nodes-in-pairs/
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ListNode list = ListNodeHelper.createList(arr);

        ListNode result = new LC_0024_SwapNodesInPairs().swapPairs(list);
        ListNodeHelper.printList(result);
    }

    //Corner Cases - Size < 2
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode tempH = head.next;
        head.next = swapPairs(head.next.next);
        tempH.next = head;

        return tempH;
    }
}

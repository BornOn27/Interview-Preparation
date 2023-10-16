package archieved.problemsByPattern.inPlaceReversalOfLinkedList;

import archieved.helper.listNode.ListNode;
import archieved.helper.listNode.ListNodeHelper;

public class LC_0023_MergeKSortedLists {

    //Question Link - https://leetcode.com/problems/merge-k-sorted-lists/
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {1,2,3};

        ListNode l1 = ListNodeHelper.createList(arr1);
        ListNode l2 = ListNodeHelper.createList(arr2);
        ListNode l3 = ListNodeHelper.createList(arr3);

        ListNode[] lists = {l1, l2, l3};

        ListNode result = new LC_0023_MergeKSortedLists().mergeKLists(lists);
        ListNodeHelper.printList(result);
    }

    /**
     *  One of the optimisation we can do
     *      - We can merge all the list using Merge-Sort Merge
     *      - We can create single list and Sort it in ==> n*log(n)
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;

        ListNode head = new ListNode(-1);
        ListNode tempH = head;

        while (true){
            int index = -1;
            int num = Integer.MAX_VALUE;

            for(int i=0;i<lists.length;i++){
                if(lists[i] == null)
                    continue;

                if(lists[i].val < num){
                    num = lists[i].val;
                    index = i;
                }
            }

            if(index == -1)
                break;

            tempH.next = lists[index];
            tempH = tempH.next;

            lists[index] = lists[index].next;
        }


        return head.next;
    }
}

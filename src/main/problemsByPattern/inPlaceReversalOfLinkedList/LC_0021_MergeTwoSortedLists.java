package main.problemsByPattern.inPlaceReversalOfLinkedList;

import main.helper.listNode.ListNode;
import main.helper.listNode.ListNodeHelper;

public class LC_0021_MergeTwoSortedLists {

    //Question Link - https://leetcode.com/problems/merge-two-sorted-lists/
    public static void main(String[] args) {
        int[] arr1 = {};
        int[] arr2 = {};

        ListNode l1 = ListNodeHelper.createList(arr1);
        ListNode l2 = ListNodeHelper.createList(arr2);

        ListNode result = new LC_0021_MergeTwoSortedLists().mergeTwoLists(l1, l2);
        ListNodeHelper.printList(result);
    }

    /**
     *  One improvement we can do here is -
     *      - Instead of searching smallest element from the list,
     *          We can create a dummy node at the beginning
     *          and create the entire list.
     *      - Return the dummy.next
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        ListNode head = null, tempH = null;

        if(list1.val < list2.val){
            head = list1;
            list1 = list1.next;
        }
        else{
            head = list2;
            list2 = list2.next;
        }

        tempH = head;

        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                tempH.next = list1;
                list1 = list1.next;
            }
            else{
                tempH.next = list2;
                list2 = list2.next;
            }

            tempH = tempH.next;
        }


        if(list1 != null){
            tempH.next = list1;
        }

        if(list2 != null){
            tempH.next = list2;
        }

        return head;
    }
}

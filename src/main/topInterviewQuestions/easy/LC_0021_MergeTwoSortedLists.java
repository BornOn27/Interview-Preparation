package main.topInterviewQuestions.easy;

import main.helper.listNode.ListNode;

public class LC_0021_MergeTwoSortedLists {
    //Question : https://leetcode.com/problems/merge-two-sorted-lists/
    public static void main(String[] args) {
        new LC_0021_MergeTwoSortedLists().mergeTwoLists(null, null);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;

        if(l2 == null)
            return l1;

        ListNode h = null;
        if(l1.val < l2.val){
            h = l1;
            l1 = l1.next;
        }
        else{
            h = l2;
            l2 = l2.next;
        }

        ListNode t = h;
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                t.next = l1;
                l1 = l1.next;
            }
            else{
                t.next = l2;
                l2 = l2.next;
            }

            t = t.next;
        }

        if(l1 == null)
            t.next = l2;
        else t.next = l1;


        return h;
    }
}

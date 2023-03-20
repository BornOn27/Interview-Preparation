package main.top_interview_questions.easy;

import helper.ListNode;

public class LC_0160_IntersectionOfTwoLinkedLists {

    //Question Link - https://leetcode.com/problems/intersection-of-two-linked-lists/
    public static void main(String[] args) {
        new LC_0160_IntersectionOfTwoLinkedLists().getIntersectionNode(new ListNode(1), new ListNode(2));
    }

    /**
     * Since "m + n = n + m"
     *   The faster the m is, in next round it will be slower
     *   The slower the n is, in next round it will be faster
     *      Eventually they meet at same point
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        boolean swapA = false, swapB = false;

        while (a != b){
            a = a.next;
            if(a == null && !swapA){
                a = headB;
                swapA = true;
            }

            b = b.next;
            if(b == null && !swapB){
                b = headA;
                swapB = true;
            }
        }

        return a;
    }
}

package main.topInterviewQuestions.easy;

import main.helper.listNode.ListNode;

public class LC_0141_LinkedListCycle {

    //Question Link - https://leetcode.com/problems/linked-list-cycle/
    public static void main(String[] args) {
//        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3)));
//        ListNode head = new ListNode(4, node);

        ListNode node = new ListNode(0);
        ListNode one = new ListNode(1);

        node.next = one;
        one.next = one;
        System.out.println(new LC_0141_LinkedListCycle().hasCycle(node));
    }

    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode s = head, f = head.next;

        while (s != f && f != null){
            s = s.next;
            f = f.next;

            if(f == null)
                return false;
            f = f.next;
        }

        return f != null;
    }
}

package main.helper.listNode;

public class ListNodeHelper {
    public static void printList(ListNode list){
        ListNode temp = list;
        while (temp != null){
            System.out.print(temp+", ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static ListNode createList(int[] arr){
        if(arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for(int i=1;i<arr.length;i++){
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        return head;
    }
}

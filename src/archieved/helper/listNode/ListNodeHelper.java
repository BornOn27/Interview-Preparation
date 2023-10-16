package archieved.helper.listNode;

import java.util.ArrayList;

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

    public static ListNode createListWithLoop(int[] arr, int loopAt){
        if(arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        ArrayList<ListNode> list = new ArrayList<>();
        list.add(head);

        for(int i=1;i<arr.length;i++){
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
            list.add(temp);
        }

        //Added Loop
        if(loopAt >=0 && loopAt < arr.length){
            list.get(list.size()-1).next = list.get(loopAt);
        }

        return head;
    }
}

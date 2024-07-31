/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // ListNode temp = head;
        // int count = 0;

        // while(temp != null){
        //     count++;
        //     temp = temp.next;
        // }

        // int a = count - n;
        // ListNode first = head;

        // while(a != 1 ){
        //     a--;
        //     if(first.next != null){
        //         first = first.next;
        //     }else{break;}
        // }

        // ListNode abc = first.next.next;
        // first.next = abc;

        // return head;
        ListNode first = reversel(head);
        ListNode abc = first;

        if(n == 1){
            ListNode xyz = first.next;
            first.next = null;
            return reversel(xyz);
        }

        while(n != 2){
            n--;
            first = first.next;
        }

        ListNode temp = first.next.next;

        if(temp == null){
            first.next = null;
        }

        first.next = temp;

        return reversel(abc);
    }

    public ListNode reversel(ListNode head){

        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        head = prev;
        return head;
    }
}
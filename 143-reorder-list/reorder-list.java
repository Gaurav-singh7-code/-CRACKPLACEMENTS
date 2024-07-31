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
    public void reorderList(ListNode head) {

    //     ListNode fast = head;
    //     ListNode slow = head;

    //     while(fast.next != null && fast.next.next != null){
    //         fast = fast.next.next;
    //         slow = slow.next;
    //     }

    //     ListNode next;
    //     ListNode prev = slow;
    //     ListNode curr = slow.next;

    //     while(curr != null){
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }

    //     ListNode first = head;
    //     ListNode last = prev;
    //     ListNode temp1=head;
    //     ListNode temp2;


    //     while(temp1 != null){
    //         temp1 = first.next;
    //         first.next = last;
    //         temp2 = last.next;
    //         first = temp1;
    //         last.next = first;
    //         last = temp2;
    //     }

    //Find middle of list using a slow and fast pointer approach
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse the second half of the list using a tmp variable
        ListNode second = slow.next;
        ListNode prev = slow.next = null;
        while (second != null) {
            ListNode tmp = second.next;
            second.next = prev;
            prev = second;
            second = tmp;
        }

        //Re-assign the pointers to match the pattern
        ListNode first = head;
        second = prev;
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
     }
}
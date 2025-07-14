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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode back = null,curr = head,next = head.next;
        while(curr != null){
            curr.next = back;
            back = curr;
            curr = next;
            if(next != null){
                next = next.next;
            }
        }
        return back;
    }
}
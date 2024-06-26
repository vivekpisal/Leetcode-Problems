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
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast != null && fast.next != null){
            if(fast != head)
                slow=slow.next;
            fast=fast.next.next;
        }
        if(head.next == null){
            head=null;
            return head;
        }
        slow.next=slow.next.next;
        return head;
    }
}
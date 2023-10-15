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
    public static int calculateLen(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        ListNode dummy = new ListNode();
        int len = calculateLen(head);
        k=k%len;
        if(k == 0 || k == len){
            return head;
        }
        dummy.next=head;
        ListNode slow=head,fast=head;
        while(k-- != 0){
            fast=fast.next;
        }
        while(fast.next != null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode newHead = slow.next;
        slow.next=null;
        fast.next=head;
        return newHead;
    }
}
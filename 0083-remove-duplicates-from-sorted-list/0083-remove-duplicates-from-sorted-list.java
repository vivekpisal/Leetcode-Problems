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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode curr=head,poi=head;
        while(poi != null){
            if(curr.val != poi.val){
                curr.next=poi;
                curr=poi;
            }
            poi=poi.next;
        }
        curr.next=null;
        return head;
    }
}
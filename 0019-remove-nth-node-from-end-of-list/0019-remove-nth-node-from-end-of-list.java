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
        ListNode dummyNode = new ListNode(-1,head);
        ListNode fast = head,slow = dummyNode;
        int count = 1;
        while(fast.next != null){
            fast = fast.next;
            count++;
            if(count >= n+1){
                slow = slow.next;
            }
        }
        slow.next = slow.next.next;
        return dummyNode.next;
    }
}
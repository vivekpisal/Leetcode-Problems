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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumPointer = new ListNode(0),temp = sumPointer;
        int carry = 0,sum=0;
        while(l1 != null || l2 != null){
            sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = sum / 10;
            sum = sum % 10;
            temp.next = new ListNode(sum,null);
            temp = temp.next;
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        if(carry != 0){
            temp.next = new ListNode(carry,null);
        }
        return sumPointer.next;
    }
}
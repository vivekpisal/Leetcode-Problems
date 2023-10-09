/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode poiA = headA;
        ListNode poiB = headB;
        while(poiA != poiB){
            poiA = poiA == null? headA:poiA.next;
            poiB = poiB == null? headB:poiB.next;
        }
        return poiA;
    }
}
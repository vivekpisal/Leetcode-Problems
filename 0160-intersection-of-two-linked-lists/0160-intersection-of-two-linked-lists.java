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
        ListNode temp1 = headA, temp2 = headB;
        int itrCount = 0;
        while(itrCount <= 2){
            if(temp1 == temp2){
                return temp1;
            }
            if(temp1.next == null){
                itrCount++;
                temp1 = headB;
            }else{
                temp1 = temp1.next;
            }
            if(temp2.next == null){
                itrCount++;
                temp2 = headA;
            }else{
                temp2 = temp2.next;
            }
            
        }
        return null;
    }
}
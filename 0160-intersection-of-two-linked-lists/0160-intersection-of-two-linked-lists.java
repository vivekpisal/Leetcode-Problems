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
        Set<ListNode> set = new HashSet<>();
        ListNode temp1 = headA,temp2 = headB;
        while(temp1 != null){
            set.add(temp1);
            temp1 = temp1.next;
        }
        while(temp2 != null){
            if(set.contains(temp2))
                return temp2;
            set.add(temp2);
            temp2 = temp2.next;
        }
        return null;
    }
}
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode head=null;
        head = list1.val > list2.val ? list2 : list1;
        ListNode t1=list1,t2=list2,next=null;
        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                while(t1.next != null && t1.next.val <= t2.val) t1=t1.next;
                next=t1.next;
                t1.next=t2;
                t1=next;
            }else{
                while(t2.next != null && t1.val >= t2.next.val) t2=t2.next;
                next=t2.next;
                t2.next=t1;
                t2=next;
            }
        }
        return head;
    }
}
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
        Map<Integer,ListNode> map = new HashMap<>();
        ListNode temp = head;
        int cnt=0;
        while(temp != null){
            cnt++;
            map.put(cnt,temp);
            temp=temp.next;
        }
        if(cnt == 1) return null;
        ListNode beforeDeleteEle=map.get(cnt-n);
        ListNode deleteEle=map.get(cnt-n+1);
        if(cnt != n)
            beforeDeleteEle.next=deleteEle.next;
        else head=deleteEle.next;
        return head;
    }
}
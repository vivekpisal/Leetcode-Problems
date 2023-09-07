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
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> minH = new PriorityQueue<>((i,j)->i.val-j.val);
        for(int i=0;i<lists.length;i++){
            ListNode st = lists[i] != null ? lists[i]:null;
            while(st!= null){
                minH.offer(st);
                st=st.next;
            }
        }
        ListNode start = minH.isEmpty() ? null : minH.poll();
        ListNode temp = start;
        while(!minH.isEmpty()){
            temp.next=minH.peek();
            temp=minH.poll();
        }
        if(temp != null)temp.next=null;
        return start;
    }
}
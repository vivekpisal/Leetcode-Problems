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
    public static ListNode addList(ListNode l1,ListNode l2){
        ListNode ans=null;
        ListNode poi1=l1,poi3=ans;
        ListNode poi2=l2;
        int carry=0;
        while(poi1 != null && poi2 != null){
            int val = poi1.val + poi2.val + carry;
            carry=0;
            if(val >= 10){
                carry=val/10;
                val = val%10;
                
            }
            if(poi3 == null){
                ans=new ListNode(val);
                poi3=ans;
            }else{
                poi3.next=new ListNode(val);
                poi3=poi3.next;
            }
            poi1=poi1.next;
            poi2=poi2.next;
        }
        while(poi1 != null){
            int val = poi1.val + carry;
            carry=0;
            if(val >= 10){
                carry=val/10;
                val = val%10;
            }
            poi3.next=new ListNode(val);
            poi3=poi3.next;
            poi1=poi1.next;
        }
        while(poi2 != null){
            int val =  poi2.val + carry;
            carry=0;
            if(val >= 10){
                carry=val/10;
                val = val%10;
            }
            poi3.next=new ListNode(val);
            poi3=poi3.next;
            poi2=poi2.next;
        }
        if(carry != 0){
            poi3.next=new ListNode(carry);
            poi3=poi3.next;
        }
        return ans;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = addList(l1,l2);
        return ans;
    }
}
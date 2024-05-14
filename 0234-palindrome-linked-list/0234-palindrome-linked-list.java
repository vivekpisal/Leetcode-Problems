class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast != null)
            slow=slow.next;
        
        slow = reverse(slow);
        fast = head;
        while(slow != null){
            if(slow.val != fast.val) return false;
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
    
    private ListNode reverse(ListNode head){
        ListNode prev=null,curr=head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
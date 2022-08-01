class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        ListNode* f=head,*s=head;
        if(head == NULL)
            return head;
        
        while(f != NULL && f->next != NULL){
            f=f->next->next;
            s=s->next;
        }
        return s;
    }
};
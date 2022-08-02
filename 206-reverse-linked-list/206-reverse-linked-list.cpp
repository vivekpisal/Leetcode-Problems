class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(head == NULL || head->next == NULL)
            return head;
        ListNode *b=NULL,*c=head,*f=head->next;
        while(c != NULL){
            c->next=b;
            b=c;
            c=f;
            if(f != NULL)
                f=f->next;
        }
        head=b;
        return head;
    }
};
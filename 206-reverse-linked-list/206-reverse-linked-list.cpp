class Solution {
public:
    ListNode *reverse(ListNode *head){
        if(head->next == NULL){
            return head;
        }
        ListNode* reverseHead=reverse(head->next);
        head->next->next=head;
        head->next=NULL;
        return reverseHead;
        
    }
    ListNode* reverseList(ListNode* head) {
        if(head == NULL)
            return head;
        return reverse(head);
        // if(head == NULL || head->next == NULL)
        //     return head;
        // ListNode *b=NULL,*c=head,*f=head->next;
        // while(c != NULL){
        //     c->next=b;
        //     b=c;
        //     c=f;
        //     if(f != NULL)
        //         f=f->next;
        // }
        // head=b;
        // return head;
    }
};
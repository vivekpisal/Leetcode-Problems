/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverse(ListNode* head){
        ListNode* b=NULL,*c=head,*f=head->next;
        while(c != NULL){
            c->next=b;
            b=c;
            c=f;
            if(f != NULL)
                f=f->next;
        }
        return b;
    }
    
    ListNode* middleNode(ListNode *head){
        ListNode* f=head,*s=head;
        while(f != NULL && f->next != NULL && f->next->next != NULL){
            f=f->next->next;
            s=s->next;
        }
        return s;
    }
    
    bool isPalindrome(ListNode* head) {
        if(head == NULL || head->next == NULL)
            return true;
        ListNode* m=middleNode(head);
        m->next=reverse(m->next);
        m=m->next;
        bool f=false;
        ListNode* temp=head;
        while(m != NULL){
            if(temp->val == m->val){
                f=true;
            }
            else{
                f=false;
                break;
            }
            m=m->next;
            temp=temp->next;
        }
        return f;
    }
};
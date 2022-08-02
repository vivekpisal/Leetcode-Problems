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
    ListNode* reverseList(ListNode* head) {
        if(head == NULL || head->next == NULL)
            return head;
        ListNode *b=NULL,*c=head,*f=head->next;
        while(f != NULL){
            c->next=b;
            b=c;
            c=f;
            f=f->next;
        }
        c->next=b;
        head=c;
        return head;
    }
};
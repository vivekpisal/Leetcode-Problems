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
    int getLength(ListNode *head){
        ListNode *temp=head;
        int len=0;
        while(temp != NULL){
            len++;
            temp=temp->next;
        }
        return len;
    }
    ListNode* rotateRight(ListNode* head, int k) {
        if(head == NULL || head->next == NULL || k == 0)
            return head;
        k++;
        int len=getLength(head);
        int r=k%len;
        int dis = len - r;
        ListNode *temp=head;
        while(temp->next != NULL){
            temp=temp->next;
        }
        temp->next=head;
        temp=head;
        while(dis != 0){
            temp=temp->next;
            dis--;
        }
        head=temp->next;
        temp->next=NULL;
        return head;
    }
};
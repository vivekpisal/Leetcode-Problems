class Solution {
public:
    int getDecimalValue(ListNode* head) {
        int len=0;
        ListNode *temp=head;
        int dec=0;
        while(temp != NULL){
            dec=dec*2;
            dec+=temp->val;
            temp=temp->next;
        }
        return dec;
    }
};
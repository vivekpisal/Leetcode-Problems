/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        unordered_map<ListNode*,int> hm;
        ListNode *temp=head;
        int i=0;
        while(temp != NULL){
            if(hm.find(temp) == hm.end())
                {hm[temp]=i;i++;}
            else
                return temp;
            temp=temp->next;
        }
        return NULL;
    }
};
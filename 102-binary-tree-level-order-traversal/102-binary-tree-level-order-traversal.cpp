/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> lOrder;
        if(root == NULL)
            return lOrder;
        
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()){
            int s=q.size();
            vector<int> level;
            for(int i=0;i<s;i++){
                TreeNode* ele=q.front();
                q.pop();
                if(ele->left != NULL){
                    q.push(ele->left);
                }
                if(ele->right != NULL)
                    q.push(ele->right);
                level.push_back(ele->val);
            }
            lOrder.push_back(level);
        }
        return lOrder;
    }
};
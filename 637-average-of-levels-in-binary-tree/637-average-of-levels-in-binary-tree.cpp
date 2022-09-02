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
    vector<double> averageOfLevels(TreeNode* root) {
        vector<double> res;
        queue<TreeNode*> q;
        q.push(root);
        
        while(!q.empty()){
            int s=q.size();
            double sum=0;
            int total_no=0;
            for(int i=0;i<s;i++){
                auto ele=q.front();
                q.pop();
                if(ele->left != NULL)
                    q.push(ele->left);
                if(ele->right != NULL)
                    q.push(ele->right);
                sum+=ele->val;
                total_no++;
            }
            res.push_back(sum/total_no);
        }
        return res;
    }
};
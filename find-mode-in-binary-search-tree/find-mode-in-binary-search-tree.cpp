class Solution {    
public:
    int max_freq = 0,curr_freq = 0,pre_cursor = INT_MIN;
    vector<int> res;
    void inorder(TreeNode* root)
    {
        if(root == NULL) return ;
        inorder(root->left);
        if(pre_cursor == root->val) curr_freq++;
        else 
            curr_freq = 1;
        if(curr_freq > max_freq)
        {
            res.clear();
            max_freq = curr_freq;
            res.push_back(root->val);
        }
        else if(curr_freq == max_freq)
        {
            res.push_back(root->val);
        }
        pre_cursor=root->val;
        inorder(root->right);
    }
    vector<int> findMode(TreeNode* root) {
        inorder(root);
        return res;
    }
};
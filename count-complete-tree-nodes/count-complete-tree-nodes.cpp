
class Solution {
public:
    int countNodes(TreeNode* root) {
        if(root == NULL)
            return 0;
        int totalnodes=0;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty())
        {
            auto curr = q.front();
            q.pop();
            totalnodes++;
            if(curr->left != NULL)
                q.push(curr->left);
            if(curr->right != NULL)
                q.push(curr->right);
        }
        return totalnodes;
    }
};
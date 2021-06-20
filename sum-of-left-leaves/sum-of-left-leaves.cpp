class Solution {
public:
    int sum=0;
    void SumLeftL(TreeNode* root)
    {
        if(root == NULL)
            return;
        if(root->left != NULL)
        {
            if(root->left->left == NULL && root->left->right == NULL)
                sum+=root->left->val;
            SumLeftL(root->left);
        }
        SumLeftL(root->right);
    }
    int sumOfLeftLeaves(TreeNode* root) {
        if(root == NULL)
            return 0;
        if(root->left == NULL && root->right == NULL)
            return 0;
        SumLeftL(root);
        return sum;
    }
};
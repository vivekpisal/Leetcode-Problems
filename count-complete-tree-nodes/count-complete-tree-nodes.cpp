class Solution {
public:
    int totalnodes=0;
    void countnodes(TreeNode *root)
    {
        if(root == NULL)
            return;
        
        totalnodes++;
        countnodes(root->left);
        countnodes(root->right);
    }
    int countNodes(TreeNode* root) {
        countnodes(root);
        return totalnodes;
    }
};
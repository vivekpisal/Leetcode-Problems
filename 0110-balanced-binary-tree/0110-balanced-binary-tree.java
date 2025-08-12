/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int balancedTree(TreeNode root){
        if(root == null) return 0;

        if(root.left == null && root.right == null) return 1;

        int leftH = balancedTree(root.left);
        int rightH = balancedTree(root.right);
        if(leftH == -1) return -1;
        if(rightH == -1) return -1;

        if(Math.abs(leftH - rightH) > 1){
            return -1;
        }

        return 1 + Math.max(balancedTree(root.left),balancedTree(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        return balancedTree(root) != -1;
    }
}
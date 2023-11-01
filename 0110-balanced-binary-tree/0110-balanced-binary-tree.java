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
    public static int checkBalanced(TreeNode root){
        if(root == null) return 0;

        int lHeight = checkBalanced(root.left);
        int rHeight = checkBalanced(root.right);
        if(rHeight == -1 || lHeight == -1) return -1;

        if(Math.abs(rHeight-lHeight) > 1) return -1;
        return Math.max(lHeight,rHeight) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(checkBalanced(root) == -1) return false;
        return true;
    }
}
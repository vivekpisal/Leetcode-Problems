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
    private int maxD = 0;
    public int checkHeight(TreeNode root){
        if(root == null) return 0;

        int lh = checkHeight(root.left);
        int rh = checkHeight(root.right);
        maxD = Math.max(maxD,lh+rh);
        return Math.max(lh,rh) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        checkHeight(root);
        return maxD;       
    }
}
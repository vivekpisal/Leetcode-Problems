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
    private int diameterOfBTree(TreeNode root,int[] maxD){
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            return 1;
        }

        int leftHeight = diameterOfBTree(root.left,maxD);
        int rightHeight = diameterOfBTree(root.right,maxD);
        int sum = leftHeight + rightHeight;
        if(sum > maxD[0]){
            maxD[0] = sum;
        }
        return Math.max(leftHeight,rightHeight) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int maxD[] = {0};
        diameterOfBTree(root,maxD);
        return maxD[0];
    }
}
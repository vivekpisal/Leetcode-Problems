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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> numbering = new LinkedList<>();
        queue.offer(root);
        numbering.offer(1);
        int maxWidth=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            int leftIdx=0,rightIdx=0;
            for(int i=0;i<size;i++){
                TreeNode top=queue.poll();
                int idx=numbering.poll();
                if(i == 0){
                    leftIdx=idx;
                } 
                if(i == size-1){
                    rightIdx=idx;
                }
                if(top.left != null){
                    queue.offer(top.left);
                    numbering.offer(2*idx);
                }
                if(top.right != null){
                    queue.offer(top.right);
                    numbering.offer(2*idx+1);
                }
            }
            maxWidth = Math.max(maxWidth,rightIdx-leftIdx+1);
        }
        return maxWidth;
    }
}
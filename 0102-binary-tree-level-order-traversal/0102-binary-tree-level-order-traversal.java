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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return levelOrder;
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> level = new ArrayList<>();
            while(n-- > 0){
                TreeNode ele = queue.poll();
                level.add(ele.val);
                if(ele.left != null){
                    queue.offer(ele.left);
                }
                if(ele.right != null){
                    queue.offer(ele.right);
                }
            }
            levelOrder.add(level);
        }
        return levelOrder;
    }
}
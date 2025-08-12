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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        boolean reverse = false;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> row = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode peek = queue.poll();
                row.add(peek.val);
                if(peek.left != null)
                    queue.offer(peek.left);
                if(peek.right != null)
                    queue.offer(peek.right);
            }
            if(reverse) Collections.reverse(row);
            reverse = !reverse;
            list.add(row);
        }
        return list;
    }
}
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
        List<List<Integer>> zigzag = new ArrayList<>();
        if(root == null) return zigzag;

        Queue<TreeNode> queue = new LinkedList<>();
        boolean reverseOrder=false;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> levelWise = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode topNode = queue.poll();
                levelWise.add(topNode.val);
                if(topNode.left != null)
                    queue.offer(topNode.left);
                if(topNode.right != null)
                    queue.offer(topNode.right);
            }
            if(reverseOrder)
                Collections.reverse(levelWise);
            reverseOrder=!reverseOrder;
            zigzag.add(levelWise);
        }
        return zigzag;
    }
}
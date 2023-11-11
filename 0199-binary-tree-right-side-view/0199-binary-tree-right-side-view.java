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
    public void rightView(TreeNode root,List<Integer> rightView,int currH){
        if(root == null) return;

        if(currH == rightView.size())   rightView.add(root.val);
        rightView(root.right,rightView,currH+1);
        rightView(root.left,rightView,currH+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> rightView = new ArrayList<>();
        if(root == null) return rightView;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            while(size > 0){
                TreeNode top = q.poll();
                if(top.left != null) q.offer(top.left);
                if(top.right != null) q.offer(top.right);
                size--;
                if(size == 0) rightView.add(top.val);
            }
        }
        return rightView;
    }
}
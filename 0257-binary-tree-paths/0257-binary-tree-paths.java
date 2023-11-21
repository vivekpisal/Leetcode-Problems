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

    public void allPaths(TreeNode node,List<String> paths,String ptn){
        if(node == null) return;
        if(node.left == null && node.right == null){
            ptn+="->"+node.val;
            paths.add(ptn);
            return;
        }

        if(node.left != null)
            allPaths(node.left,paths,ptn+"->"+node.val);
        if(node.right != null)
            allPaths(node.right,paths,ptn+"->"+node.val);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        String ptn = "";
        ptn+=root.val;
        if(root.left == null && root.right == null){
            paths.add(ptn);
            return paths;
        }
        allPaths(root.left,paths,ptn);
        allPaths(root.right,paths,ptn);
        return paths;
    }
}
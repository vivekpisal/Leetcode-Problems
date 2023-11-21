/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean findPath(TreeNode node,List<TreeNode> path,TreeNode d){
        if(node == null) return false;
        if(node == d) {
            path.add(node);
            return true;
        }      
        path.add(node);
        boolean ans = findPath(node.left,path,d);
        if(ans)
           return true;
        boolean ans1 = findPath(node.right,path,d);
        if(ans1)
            return true;
        path.remove(path.size()-1);
        return false;
    } 
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();
        findPath(root,pathP,p);
        findPath(root,pathQ,q);
        Map<TreeNode,Integer> map = new HashMap<>();
        for(TreeNode i:pathP){
            map.putIfAbsent(i,1);
        }
        for(int i=pathQ.size()-1;i>=0;i--){
            if(map.containsKey(pathQ.get(i))){
                return pathQ.get(i);
            }
        }
        return null;
    } 
    
}
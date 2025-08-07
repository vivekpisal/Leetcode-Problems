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

class Pair{
    TreeNode node;
    int index;
    Pair(TreeNode node,int index){
        this.node = node;
        this.index = index;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        Queue<Pair> queue = new LinkedList<>();
        int maxWidth = Integer.MIN_VALUE;
        queue.offer(new Pair(root,1));
        while(!queue.isEmpty()){
            int first = 0,last = 0;
            int size = queue.size();
            int mmin = queue.peek().index;
            for(int i=0;i<size;i++){
                TreeNode node = queue.peek().node;
                int index = queue.peek().index;
                queue.poll();

                if(i == 0)
                    first = index;
                if(i == size-1)
                    last = index;
                
                if(node.left != null)
                    queue.offer(new Pair(node.left,(index-mmin)*2+1));
                if(node.right != null)
                    queue.offer(new Pair(node.right,(index-mmin)*2+2));
            }
            maxWidth = Math.max(last - first + 1,maxWidth);
        }
        return maxWidth;
    }
}
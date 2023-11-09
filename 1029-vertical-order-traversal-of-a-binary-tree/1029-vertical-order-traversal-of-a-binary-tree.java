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
class Tuple{
    TreeNode val;
    int x,y;
    public Tuple(TreeNode val,int x,int y){
        this.val=val;
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Tuple> queue= new LinkedList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();       
        queue.offer(new Tuple(root,0,0));
        while(!queue.isEmpty()){
            Tuple top = queue.poll();
            TreeNode ele = top.val;
            int x=top.x;
            int y=top.y;
            if(!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<>());
            }
            map.get(x).get(y).offer(ele.val);
            if(ele.left != null){
                queue.offer(new Tuple(ele.left,top.x-1,top.y+1));
            }
            if(ele.right != null){
                queue.offer(new Tuple(ele.right,top.x+1,top.y+1));
            }
        }
        List<List<Integer>> verticalOrder = new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> ys:map.values()){
            verticalOrder.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes:ys.values()){
                while(!nodes.isEmpty()){
                    verticalOrder.get(verticalOrder.size()-1).add(nodes.poll());
                }
            }
        }
        return verticalOrder;
    }
}
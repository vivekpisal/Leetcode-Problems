/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> counterMap = new HashMap<>();
        Node poi1 = head;
        Node newHead=null,poi2=newHead;  
        while(poi1 != null){
            if(newHead == null){
                newHead = new Node(poi1.val);
                poi2=newHead;
                counterMap.put(poi1,poi2);
            }else{
                poi2.next=new Node(poi1.val);
                counterMap.put(poi1,poi2.next);
                poi2=poi2.next;
            }
            poi1=poi1.next;
        }
        poi1=head;
        poi2=newHead;
        while(poi1 != null){
            if(poi1.random != null)
                poi2.random=counterMap.get(poi1.random);
            poi2=poi2.next;
            poi1=poi1.next;
        }
        return newHead;
    }
}
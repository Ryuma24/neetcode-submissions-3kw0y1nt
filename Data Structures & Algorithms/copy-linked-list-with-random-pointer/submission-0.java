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
       Map<Node , Node> mp = new HashMap<>();
       Node curr=head;
       while(curr!=null){
        Node copied = new Node(curr.val);
        mp.put(curr,copied);
        curr=curr.next;
       }
        curr=head;
        
       while(curr!=null){

        Node copied = mp.get(curr);
        copied.random = mp.get(curr.random);
        copied.next = mp.get(curr.next);
        
        curr=curr.next;
       }

       return mp.get(head);
    }
}

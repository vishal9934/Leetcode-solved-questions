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
//    ptr = head;
//     while (ptr != null) {
//       if (ptr.random != null) {
//         Node ptrCopy = map.get(ptr);
//         Node randomCopy = map.get(ptr.random);

//         ptrCopy.random = randomCopy;
//       }
//       ptr = ptr.next;
//     }

//     // ignore sentinel node
//     copy = copy.next;
//     return copy;

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> mp=new HashMap<>();
        Node dummy=new Node(-1);
        Node prev=dummy;
        
        Node current=head;
        while(current!=null){
            Node node=new Node(current.val);
            prev.next=node;
            
            mp.put(current,node);//putting the val in map
            
             prev=prev.next;
            current=current.next;
           
        }
        // Node nNode=dummy.next;
        // Node c1=head;
        // Node c2=nNode;
        current=head;
        while(current!=null){
           // Node c2=(current.random!=null?mp.get(current.random):null);
           //  c1=current.next;
           //  c2=c2.next;
            if(current.random!=null){
                Node copy=mp.get(current);
                Node copyrandom=mp.get(current.random);
                copy.random=copyrandom;
            }
            current=current.next;
        }
        return dummy.next;
    }
}
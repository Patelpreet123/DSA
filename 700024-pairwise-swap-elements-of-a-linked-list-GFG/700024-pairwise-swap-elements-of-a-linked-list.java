/* Structure of linked list Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
};*/
class Solution {
    public Node pairwiseSwap(Node head) {
        // code here
        if(head==null||head.next==null){
            return head;
        }
        Node h=new Node(-1);
        h.next=head;
        Node p=h;
        while(p.next!=null&&p.next.next!=null){
            Node f=p.next; 
            Node s=p.next.next;
            f.next=s.next;
            s.next=f;
            p.next=s;
            p=f;
        }
        return h.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
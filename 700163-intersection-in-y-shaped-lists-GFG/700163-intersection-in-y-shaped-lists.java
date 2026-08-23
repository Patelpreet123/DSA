/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node t1=head1;
        Node t2=head2;
        while(true){
            if(t1==t2){
                return t1;
            }
            if(t1.next==null&&t2.next==null){
                return null;
            }
            if(t1.next==null){
                t1=head2;
            }
            else{
                t1=t1.next;
            }
            if(t2.next==null){
                t2=head1;
            }
            else{
                t2=t2.next;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
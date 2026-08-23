/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    Node divide(Node head) {
        // code here
        Node c=head;
        Node h1=new Node(-1);
        Node t1=h1;
        Node h2=new Node(-1);
        Node t2=h2;
        while(c!=null){
            if(c.data%2==0){
                t2.next=c;
                t2=c;
            }
            else{
                t1.next=c;
                t1=c;
            }
            c=c.next;
        }
        t1.next=null;
        t2.next=h1.next;
        return h2.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
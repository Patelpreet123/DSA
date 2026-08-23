/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node addOne(Node head) {
        // code here.
        head=rev(head);
        Node t=head;
        int s=t.data+1;
        t.data=s%10;
        int c=s/10;
        t=t.next;
        while(t!=null){
            s=t.data+c;
            t.data=s%10;
            c=s/10;
            t=t.next;
        }
        head=rev(head);
        if(c==1){
            Node nn=new Node(1);
            nn.next=head;
            return nn;
        }
        return head;
    }
    Node rev(Node h){
        Node p=null;
        Node c=h;
        Node n;
        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
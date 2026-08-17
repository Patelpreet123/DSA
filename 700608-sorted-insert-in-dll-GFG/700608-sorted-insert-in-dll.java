/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        Node nn=new Node(x);
        if(head.data>=x){
            nn.next=head;
            head.prev=nn;
            return nn;
        }
        Node t=head;
        while(t.next!=null){
            if(x>=t.data&&x<t.next.data){
                Node x1=t.next;
                t.next=nn;
                nn.next=x1;
                x1.prev=nn;
                nn.prev=t;
                return head;
            }
            t=t.next;
        }
        t.next=nn;
        nn.prev=t;
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        while(head1!=null&&head1.data==0){
            head1=head1.next;
        }
        while(head2!=null&&head2.data==0){
            head2=head2.next;
        }
        if(head1==null&&head2==null){
            return new Node(0);
        }
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        head1=rev(head1);
        head2=rev(head2);
        Node h=new Node(-1);
        Node t=h;
        int c=0;
        while(head1!=null&&head2!=null){
            int s=head1.data+head2.data+c;
            Node nn=new Node(s%10);
            t.next=nn;
            t=nn;
            c=s/10;
            head1=head1.next;
            head2=head2.next;
        }
        while(head1!=null){
            int s=head1.data+c;
            Node nn=new Node(s%10);
            t.next=nn;
            t=nn;
            c=s/10;
            head1=head1.next;
        }
        while(head2!=null){
            int s=head2.data+c;
            Node nn=new Node(s%10);
            t.next=nn;
            t=nn;
            c=s/10;
            head2=head2.next;
        }
        if(c==1){
            Node nn=new Node(1);
            t.next=nn;
            t=nn;
        }
        return rev(h.next);
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
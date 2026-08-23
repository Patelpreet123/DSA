/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node l0=new Node(-1);
        Node t0=l0;
        Node l1=new Node(-1);
        Node t1=l1;
        Node l2=new Node(-1);
        Node t2=l2;
        Node t=head;
        while(t!=null){
            if(t.data==0){
                t0.next=t;
                t0=t;
            }
            else if(t.data==1){
                t1.next=t;
                t1=t;
            }
            else{
                t2.next=t;
                t2=t;
            }
            t=t.next;
        }
        t2.next=null;
        if(l1.next==null){
            t0.next=l2.next;
            return l0.next;
        }
        else{
            t0.next=l1.next;
        }
        t1.next=l2.next;
        return l0.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
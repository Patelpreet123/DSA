/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/

class Solution {
    public Node reverseKGroup(Node head, int k) {
        // code here
        Node t=head;
        int x=k-1;
        while(x-->0){
            t=t.next;
        }
        Node t1=t.next;
        t.next=null;
        t=head;
        head=rev(head);
        t.next=t1;
        Node pt=t;
        Node h=t1;
        while(h!=null){
            x=k-1;
            Node tmp=h;
            while(x-->0){
                tmp=tmp.next;
                if(tmp==null){
                    pt.next=rev(h);
                    return head;
                }
            }
            Node nxt=tmp.next;
            tmp.next=null;
            rev(h);
            pt.next=tmp;
            h.next=nxt;
            pt=h;
            h=nxt;
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
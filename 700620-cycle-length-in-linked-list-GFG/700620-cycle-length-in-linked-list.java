/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node s=head,f=head;
        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                f=f.next;
                int x=1;
                while(s!=f){
                    x++;
                    f=f.next;
                }
                return x;
            }
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
        Node s=head,f=head;
        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                f=head;
                while(s!=f){
                    s=s.next;
                    f=f.next;
                }
                return s.data;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node headRef) {
        // code here
        Node t=headRef;
        while(t.next!=null){
            if(t.next.data==t.data){
                t.next=t.next.next;
                if(t.next==null){
                    return headRef;
                }
                t.next.prev=t;
                continue;
            }
            t=t.next;
        }
        return headRef;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
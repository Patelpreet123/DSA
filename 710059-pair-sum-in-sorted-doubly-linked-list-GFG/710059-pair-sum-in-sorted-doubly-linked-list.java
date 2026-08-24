/* Structure of Doubly Linked List Node
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}; */

class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        // code here
        ArrayList<ArrayList<Integer>> l=new ArrayList<>();
        Node s=head;
        Node e=head;
        while(e.next!=null){
            e=e.next;
        }
        while(s!=null&&e!=null&&s!=e&&s.prev!=e){
            int sum=s.data+e.data;
            if(sum==target){
                ArrayList<Integer> l1=new ArrayList<>();
                l1.add(s.data);
                l1.add(e.data);
                l.add(l1);
                s=s.next;
                e=e.prev;
            }
            else if(sum>target){
                e=e.prev;
            }
            else{
                s=s.next;
            }
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
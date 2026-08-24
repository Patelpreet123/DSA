/* Linked List Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    Node mergeKLists(Node[] arr) {
        // code here
        Node h=new Node(-1);
        for(int i=0;i<arr.length;i++){
            h=merge(h,arr[i]);
        }
        return h.next;
    }
    Node merge(Node l1,Node l2){
        Node h=new Node(-1);
        Node t=h;
        while(l1!=null&&l2!=null){
            if(l1.data<=l2.data){
                t.next=l1;
                l1=l1.next;
            }
            else{
                t.next=l2;
                l2=l2.next;
            }
            t=t.next;
        }
        if(l1!=null){
            t.next=l1;
        }
        else{
            t.next=l2;
        }
        return h.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
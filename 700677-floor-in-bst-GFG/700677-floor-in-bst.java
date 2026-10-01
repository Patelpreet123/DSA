/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int findMaxFork(Node root, int k) {
        // code here.
        int x=Integer.MIN_VALUE;
        Node t=root;
        while(t!=null){
            if(k==t.data){
                return t.data;
            }
            if(k>t.data){
                x=Math.max(x,t.data);
                t=t.right;
            }
            else{
                t=t.left;
            }
        }
        if(x==Integer.MIN_VALUE){
            return -1;
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
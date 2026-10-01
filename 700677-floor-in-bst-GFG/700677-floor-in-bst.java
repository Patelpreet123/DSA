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
    int x=Integer.MIN_VALUE;
    public int findMaxFork(Node root, int k) {
        // code here.
        f(root,k);
        if(x==Integer.MIN_VALUE){
            return -1;
        }
        return x;
    }
    void f(Node root,int k){
        if(root==null){
            return;
        }
        if(root.data<=k){
            x=Math.max(root.data,x);
        }
        f(root.left,k);
        f(root.right,k);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
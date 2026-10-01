/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
} */

class Solution {
    int findCeil(Node root, int x) {
        // code here
        int ans=Integer.MAX_VALUE;
        Node t=root;
        while(t!=null){
            if(t.data==x){
                return x;
            }
            if(x<t.data){
                ans=Math.min(ans,t.data);
                t=t.left;
            }
            else{
                t=t.right;
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
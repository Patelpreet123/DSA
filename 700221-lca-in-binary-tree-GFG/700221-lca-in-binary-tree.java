/* Structure of binary tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
}
}*/

class Solution {
    Node lca(Node root, int n1, int n2) {
        if(root==null){
            return null;
        }
        if(root.data==n1||root.data==n2){
            return root;
        }
        Node l=lca(root.left,n1,n2);
        Node r=lca(root.right,n1,n2);
        if(l==null){
            return r;
        }
        if(r==null){
            return l;
        }
        return root;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
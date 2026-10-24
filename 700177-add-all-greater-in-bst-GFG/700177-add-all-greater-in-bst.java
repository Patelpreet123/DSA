/* BST Node Structure
class Node {
     int data;
     Node left, right;

     public Node(int d)
     {
         data = d;
         left = right = null;
     }
} */

class Solution {
    public Node transformTree(Node root) {
        // code here
        int[] s={0};
        f(root,s);
        return root;
    }
    void f(Node root,int[] s){
        if(root==null){
            return;
        }
        f(root.right,s);
        s[0]+=root.data;
        root.data=s[0];
        f(root.left,s);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
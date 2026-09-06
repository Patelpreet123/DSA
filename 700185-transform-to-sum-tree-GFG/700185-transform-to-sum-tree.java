/* Structure for Tree Node
class Node {
    int data;
    Node left, right;

    // Constructor
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/
class Solution {
    public void toSumTree(Node root) {
        // code here
        f(root);
    }
    int f(Node root){
        if(root==null){
            return 0;
        }
        int s=root.data+f(root.left)+f(root.right);
        root.data=s-root.data;
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
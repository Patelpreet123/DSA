/* Definition for Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};
*/

class Solution {
    int ans=-1;
    public int kthAncestor(Node root, int k, int node) {
        // code here
        f(root,k,node);
        return ans;
    }
    int f(Node root, int k, int node){
        if(root==null){
            return -1;
        }
        if(root.data==node){
            return 0;
        }
        int l=f(root.left,k,node);
        int r=f(root.right,k,node);
        if(l==-1&&r==-1){
            return -1;
        }
        int m=Math.max(l,r)+1;
        if(m==k){
            ans=root.data;
        }
        return m;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
/* A binary tree node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public int findDist(Node root, int a, int b) {
        // code here
        Node x=lca(root,a,b);
        int d1=dist(x,a);
        int d2=dist(x,b);
        return d1+d2;
    }
    Node lca(Node root,int a,int b){
        if(root==null){
            return null;
        }
        if(root.data==a||root.data==b){
            return root;
        }
        Node l=lca(root.left,a,b);
        Node r=lca(root.right,a,b);
        if(l==null){
            return r;
        }
        if(r==null){
            return l;
        }
        return root;
    }
    int dist(Node root,int t){
        if(root==null){
            return -1;
        }
        if(root.data==t){
            return 0;
        }
        int l=dist(root.left,t);
        int r=dist(root.right,t);
        if(l==-1&&r==-1){
            return -1;
        }
        if(l==-1){
            return r+1;
        }
        else{
            return l+1;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
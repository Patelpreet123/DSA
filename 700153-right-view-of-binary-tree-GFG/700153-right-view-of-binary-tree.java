/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        f(root,0,l);
        return l;
    }
    void f(Node root,int level,ArrayList<Integer> l){
        if(root==null){
            return;
        }
        if(level==l.size()){
            l.add(root.data);
        }
        f(root.right,level+1,l);
        f(root.left,level+1,l);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
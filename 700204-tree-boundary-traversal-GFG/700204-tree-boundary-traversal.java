/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        if(root==null){
            return l;
        }
        l.add(root.data);
        tleft(root.left,l);
        tleaf(root.left,l);
        tleaf(root.right,l);
        tright(root.right,l);
        return l;
    }
    void tleft(Node root,ArrayList<Integer> l){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            return;
        }
        l.add(root.data);
        if(root.left!=null){
            tleft(root.left,l);
        }
        else{
            tleft(root.right,l);
        }
    }
    void tright(Node root,ArrayList<Integer> l){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            return;
        }
        if(root.right!=null){
            tright(root.right,l);
        }
        else{
            tright(root.left,l);
        }
        l.add(root.data);
    }
    void tleaf(Node root,ArrayList<Integer> l){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            l.add(root.data);
            return;
        }
        tleaf(root.left,l);
        tleaf(root.right,l);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
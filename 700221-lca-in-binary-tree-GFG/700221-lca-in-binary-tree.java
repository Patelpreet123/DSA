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
        // code here
        List<Node> p1=new ArrayList<>();
        path(root,p1,n1);
        List<Node> p2=new ArrayList<>();
        path(root,p2,n2);
        int i=0;
        for(;i<p1.size()&&i<p2.size();i++){
            if(p1.get(i)!=p2.get(i)){
                break;
            }
        }
        return p1.get(i-1);
    }
    boolean path(Node r,List<Node> l,int t){
        if(r==null){
            return false;
        }
        l.add(r);
        if(r.data==t){
            return true;
        }
        if(path(r.left,l,t)||path(r.right,l,t)){
            return true;
        }
        l.remove(l.size()-1);
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
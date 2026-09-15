/* Structure of binary tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}*/
class Solution {
    public ArrayList<Integer> diagonal(Node root) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        if(root==null){
            return l;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node t=q.remove();
            while(t!=null){
                l.add(t.data);
                if(t.left!=null){
                    q.add(t.left);
                }
                t=t.right;
            }
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
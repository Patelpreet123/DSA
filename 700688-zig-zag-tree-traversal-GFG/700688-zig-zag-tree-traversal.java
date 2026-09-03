/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> l1=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int f=0;
        while(!q.isEmpty()){
            Node t=q.remove();
            if(t==null){
                if(f==0){
                    for(int i=0;i<l1.size();i++){
                        l.add(l1.get(i));
                    }
                    f=1;
                }
                else{
                    for(int i=l1.size()-1;i>=0;i--){
                        l.add(l1.get(i));
                    }
                    f=0;
                }
                l1=new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                    continue;
                }
            }
            l1.add(t.data);
            if(t.left!=null){
                q.add(t.left);
            }
            if(t.right!=null){
                q.add(t.right);
            }
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
/*
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
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        HashMap<Integer,Integer> m=new HashMap<>();
        HashMap<Integer,Integer> d=new HashMap<>();
        f(m,d,root,0,0);
        ArrayList<Integer> l=new ArrayList<>(m.keySet());
        Collections.sort(l);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int x:l){
            ans.add(m.get(x));
        }
        return ans;
    }
    void f(HashMap<Integer,Integer> m,HashMap<Integer,Integer> d,Node root,int c,int r){
        if(root==null){
            return;
        }
        if(!m.containsKey(c)||r>=d.get(c)){
            m.put(c,root.data);
            d.put(c,r);
        }
        f(m,d,root.left,c-1,r+1);
        f(m,d,root.right,c+1,r+1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
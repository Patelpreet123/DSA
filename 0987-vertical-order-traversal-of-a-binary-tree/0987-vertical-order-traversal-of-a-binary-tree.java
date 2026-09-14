/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        HashMap<Integer,List<int[]>> m=new HashMap<>();
        f(m,root,0,0);
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> k=new ArrayList<>(m.keySet());
        Collections.sort(k);
        List<int[]> t;
        for(int x:k){
            t=m.get(x);
            Collections.sort(t,(a,b)->{
                if(a[0]==b[0]){
                    return a[1]-b[1];
                }
                return a[0]-b[0];
            });
            List<Integer> l1=new ArrayList<>();
            for(int[] x1:t){
                l1.add(x1[1]);
            }
            l.add(l1);
        }
        return l;
    }
    void f(HashMap<Integer,List<int[]>> m,TreeNode root,int c,int r){
        if(root==null){
            return;
        }
        if(m.containsKey(c)){
            m.get(c).add(new int[]{r,root.val});
        }
        else{
            List<int[]> l=new ArrayList<>();
            l.add(new int[]{r,root.val});
            m.put(c,l);
        }
        f(m,root.left,c-1,r+1);
        f(m,root.right,c+1,r+1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
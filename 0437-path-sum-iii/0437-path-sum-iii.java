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
    int x=0;
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long,Integer> m=new HashMap<>();
        m.put(0l,1);
        f(root,targetSum,0,m);
        return x;
    }
    void f(TreeNode root,int t,long s,HashMap<Long,Integer> m){
        if(root==null){
            return;
        }
        s=s+root.val;
        if(m.containsKey(s-t)){
            x+=m.get(s-t);
        }
        m.put(s,m.getOrDefault(s,0)+1);
        f(root.left,t,s,m);
        f(root.right,t,s,m);
        m.put(s,m.get(s)-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
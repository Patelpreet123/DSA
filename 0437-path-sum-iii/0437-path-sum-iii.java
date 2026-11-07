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
    int ans=0;
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long,Integer> mp=new HashMap<>();
        mp.put(0l,1);
        f(root,targetSum,mp,0);
        return ans;
    }
    void f(TreeNode root,int t,HashMap<Long,Integer> mp,long s){
        if(root==null){
            return;
        }
        s+=root.val;
        if(mp.containsKey(s-t)){
            ans+=mp.get(s-t);
        }
        if(mp.containsKey(s)){
            mp.put(s,mp.get(s)+1);
        }
        else{
            mp.put(s,1);
        }
        f(root.left,t,mp,s);
        f(root.right,t,mp,s);
        mp.put(s,mp.get(s)-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
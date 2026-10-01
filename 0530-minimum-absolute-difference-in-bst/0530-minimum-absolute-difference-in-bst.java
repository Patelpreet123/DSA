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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> l=new ArrayList<>();
        f(root,l);
        int m=Integer.MAX_VALUE;
        for(int i=1;i<l.size();i++){
            int x=l.get(i)-l.get(i-1);
            if(x<m){
                m=x;
            }
        }
        return m;
    }
    void f(TreeNode root,ArrayList<Integer> l){
        if(root==null){
            return;
        }
        f(root.left,l);
        l.add(root.val);
        f(root.right,l);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
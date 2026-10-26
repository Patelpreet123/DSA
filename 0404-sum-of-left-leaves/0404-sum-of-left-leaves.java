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
    int s=0;
    public int sumOfLeftLeaves(TreeNode root) {
        f(root,1);
        return s;
    }
    void f(TreeNode root,int x){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            if(x==0){
                s+=root.val;
            }
            return;
        }
        f(root.left,0);
        f(root.right,1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
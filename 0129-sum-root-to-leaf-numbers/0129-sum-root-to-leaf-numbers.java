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
    public int sumNumbers(TreeNode root) {
        f(root,0);
        return s;
    }
    void f(TreeNode root,int t){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            s+=(t*10+root.val);
            return;
        }
        f(root.left,t*10+root.val);
        f(root.right,t*10+root.val);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
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
    int c=0;
    public int minCameraCover(TreeNode root) {
        if(f(root) == 0) c++;
        return c;
    }
    int f(TreeNode root){
        if(root==null){
            return 2;
        }
        int l=f(root.left);
        int r=f(root.right);
        if(l*r==0){
            c++;
            return 1;
        }
        else if(l==1||r==1){
            return 2;
        }
        else{
            return 0;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
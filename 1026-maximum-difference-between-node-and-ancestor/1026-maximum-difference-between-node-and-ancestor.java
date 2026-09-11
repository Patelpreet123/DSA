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
    public int maxAncestorDiff(TreeNode root) {
        int[] a={0};
        x(root,Integer.MAX_VALUE,0,a);
        return a[0];
    }
    void x(TreeNode root,int min,int max,int[] a){
        if(root==null){
            return;
        }
        min=Math.min(root.val,min);
        max=Math.max(root.val,max);
        a[0]=Math.max(a[0],max-min);
        x(root.left,min,max,a);
        x(root.right,min,max,a);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
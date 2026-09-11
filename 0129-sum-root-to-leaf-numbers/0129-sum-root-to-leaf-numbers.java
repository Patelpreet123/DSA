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
    public int sumNumbers(TreeNode root) {
        int[] a={0};
        fun(root,0,a);
        return a[0];
    }
    void fun(TreeNode root,int curr,int[] a){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            a[0]+=(curr*10+root.val);
            return;
        }
        curr=curr*10+root.val;
        fun(root.left,curr,a);
        fun(root.right,curr,a);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
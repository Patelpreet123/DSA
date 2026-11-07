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
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        return f(root,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    }
    int f(TreeNode root,long t){
        if(root==null){
            return 0;
        }
        t-=root.val;
        int cnt=0;
        if(t==0){
            cnt=1;
        }
        cnt+=f(root.left,t);
        cnt+=f(root.right,t);
        return cnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
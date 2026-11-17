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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return f(root1,root2);
    }
    TreeNode f(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null){
            return null;
        }
        int x=0;
        if(root1!=null&&root2!=null){
            x=root1.val+root2.val;
        }
        else if(root1!=null){
            x=root1.val;
        }
        else{
            x=root2.val;
        }
        TreeNode t=new TreeNode(x);
        t.left=f(root1!=null?root1.left:null,root2!=null?root2.left:null);
        t.right=f(root1!=null?root1.right:null,root2!=null?root2.right:null);
        return t;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
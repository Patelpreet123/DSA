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
    public int averageOfSubtree(TreeNode root) {
        sum(root);
        int[] a={0};
        count(root,a);
        return a[0];
    }
    int sum(TreeNode root){
        if(root==null){
            return 0;
        }
        int sl=sum(root.left);
        int sr=sum(root.right);
        root.val+=(sl+sr);
        return root.val;
    }
    int count(TreeNode root,int[] a){
        if(root==null){
            return 0;
        }
        int cl=count(root.left,a);
        int cr=count(root.right,a);
        int original=root.val;
        if(root.left!=null){
            original-=root.left.val;
        }
        if(root.right!=null){
            original-=root.right.val;
        }
        if(original==root.val/(cl+cr+1)){
            a[0]++;
        }
        return cl+cr+1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
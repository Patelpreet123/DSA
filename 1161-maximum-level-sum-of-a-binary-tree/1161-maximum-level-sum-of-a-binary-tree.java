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
    public int maxLevelSum(TreeNode root) {
        int m=Integer.MIN_VALUE;
        int l=0,ml=-1;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int s=0;
        while(!q.isEmpty()){
            TreeNode t=q.remove();
            if(t==null){
                l++;
                if(s>m){
                    m=s;
                    ml=l;
                }
                s=0;
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                    continue;
                }
            }
            s=s+t.val;
            if(t.left!=null){
                q.add(t.left);
            }
            if(t.right!=null){
                q.add(t.right);
            }
        }
        return ml;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
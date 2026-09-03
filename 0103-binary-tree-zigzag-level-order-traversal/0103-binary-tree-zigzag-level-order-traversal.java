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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        if(root==null){
            return l;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> l1=new ArrayList<>();
        int f=0;
        while(!q.isEmpty()){
            TreeNode t=q.remove();
            if(t==null){
                if(f==0){
                    l.add(l1);
                    f=1;
                }
                else{
                    Collections.reverse(l1);
                    l.add(l1);
                    f=0;
                }
                l1=new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                    continue;
                }
            }
            l1.add(t.val);
            if(t.left!=null){
                q.add(t.left);
            }
            if(t.right!=null){
                q.add(t.right);
            }
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
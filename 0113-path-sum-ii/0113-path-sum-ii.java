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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> l=new ArrayList<>();
        f(root,targetSum,l,new ArrayList<>());
        return l;
    }
    void f(TreeNode root,int t,List<List<Integer>> l,List<Integer> l1){
        if(root==null){
            return;
        }
        l1.add(root.val);
        if(root.left==null&&root.right==null){
            if(t==root.val){
                l.add(new ArrayList<>(l1));
            }
            l1.remove(l1.size()-1);
            return;
        }
        f(root.left,t-root.val,l,l1);
        f(root.right,t-root.val,l,l1);
        l1.remove(l1.size()-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
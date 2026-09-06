/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> p1=new ArrayList<>();
        path(root,p,p1);
        List<TreeNode> p2=new ArrayList<>();
        path(root,q,p2);
        int i=0;
        for(;i<p1.size()&&i<p2.size();i++){
            if(p1.get(i)!=p2.get(i)){
                break;
            }
        }
        return p1.get(i-1);
    }
    boolean path(TreeNode root,TreeNode t,List<TreeNode> x){
        if(root==null){
            return false;
        }
        x.add(root);
        if(root==t){
            return true;
        }
        if(path(root.left,t,x)||path(root.right,t,x)){
            return true;
        }
        x.remove(x.size()-1);
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
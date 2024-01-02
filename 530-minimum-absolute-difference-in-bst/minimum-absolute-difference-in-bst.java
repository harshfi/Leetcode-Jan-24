public class Solution {
    int prev = Integer.MAX_VALUE;
    int ans = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return ans;

    }
    public void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        if(prev!=Integer.MAX_VALUE) ans = Math.min(ans , Math.abs( root.val - prev) );
        prev = root.val;
        helper(root.right);
    }
}
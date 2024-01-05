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
    int max=0;
    public int maxAncestorDiff(TreeNode root) {
        max=0;
        helper(root);
        return max;
    
    }
    public void helper(TreeNode root){
        if(root==null) return;

        find(root.val,root.left);
        find(root.val,root.right);
        helper(root.left);
        helper(root.right);
    }
    public void find(int val, TreeNode root){
        if(root==null) return ;

        max=Math.max(max,Math.abs(val-root.val));
        find(val,root.left);
        find(val,root.right);
    }
}
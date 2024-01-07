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
    static int n=0;
    public int countNodes(TreeNode root) {
        n=0;
        count (root);
        return n;

        
    }
    public void count(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        n++;
        count(root.left);
        count(root.right);
    }
}
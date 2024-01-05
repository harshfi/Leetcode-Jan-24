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
    String minString = "";
    public String smallestFromLeaf(TreeNode root) {
        traverse(root,"");
        return minString;
    }
    private void traverse(TreeNode root, String current)
    {
        if(root == null)
        return;

        current = "" + (char)(root.val + 'a') + current;

        if(root.left == null && root.right == null)
        {
            if(minString.compareTo("") == 0)
            minString = current;
            else
            minString = current.compareTo(minString) < 0 ? current : minString;
        }
        traverse(root.left,current);
        traverse(root.right,current);
        
    }
}
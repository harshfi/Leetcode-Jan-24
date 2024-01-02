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
    int ans=0;
    int hi=-1;
    public int findBottomLeftValue(TreeNode root) {
        ans=root.val;
        hi=-1;
        find(root,0);
        return ans;
        
    }
    public void find(TreeNode root,int h) {
        if(root==null) return;
         
         find(root.left,h+1);
         if(hi<h ){
            hi=h;
            ans=root.val;
         }
         find(root.right,h+1);

        
    }
}
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
    public int longestUnivaluePath(TreeNode root) {
        ans=0;
        triverse(root,-10001);
        return ans;
        
    }
    public int triverse(TreeNode root, int prev){
        if(root==null) return 0;

      

       int left = triverse(root.left,root.val);
       int right= triverse(root.right,root.val);
      
      if(prev==root.val ){
          ans=Math.max(Math.max(left,Math.max(left+right,right)),ans);
          return 1+Math.max(left,right);
      }
      else{
          ans=Math.max(left+right,ans);
          return 0;

      } 


       



    }
}
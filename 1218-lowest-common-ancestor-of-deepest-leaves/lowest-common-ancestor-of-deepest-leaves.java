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
    TreeNode r;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        
        r= null;
        find(root,0);

        return r;
        
    }
    public int find( TreeNode root, int d){
        if(root==null) return d;

        int l=find(root.left,d+1);
        int r=find(root.right,d+1);
        int cur= Math.max(l,r);
        max=Math.max(cur,max);
        if(l==max && r==max){
            this.r= root;
        }
        return cur;
    }
}
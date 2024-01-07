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
    TreeNode found=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
         found=null;
        find(root,p,q);
        return found;

        
    }
    public boolean find(TreeNode root, TreeNode p, TreeNode q){
        if (root==null) return false;

        if(p==root||q==root){
            boolean left=  find(root.left,p,q);
            boolean right=  find(root.right,p,q);
           if(left || right) {
               found=root;
               return true;
           }
           else return true;
        }
        boolean left=  find(root.left,p,q);
        boolean right=  find(root.right,p,q);
        if(left==true && right==true && found==null) found=root;

        return left|| right;

    }
}
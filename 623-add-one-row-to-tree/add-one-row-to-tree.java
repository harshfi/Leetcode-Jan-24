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
    int val=0;
    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        if(depth==1){
            TreeNode node = new TreeNode(val);
            node.left= root;
            return node;
        }
        this.val=val;
       return make(root,1,depth,'.');
        
    }
    public TreeNode make(TreeNode root, int i, int d,char c){
        if(d==i){
          TreeNode node = new TreeNode(val);
          if(c=='l')
           node.left= root;
           
           else
           node.right=root;

           return node;

        }
        if(root==null) return null;
        
        else{
         root.left=make(root.left,i+1,d,'l');
         root.right=make(root.right,i+1,d,'r');
         return root;
        }
    }
}
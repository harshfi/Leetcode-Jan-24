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
    List<Integer> list=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
       if(root==null) return 0;
        inorder(root);
        int min=Integer.MAX_VALUE;
        for(int i=1; i<list.size(); i++){
            min=Math.min(list.get(i)-list.get(i-1), min);
        }
        return min;
        
    }
    public void inorder(TreeNode root) {
        if(root==null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}
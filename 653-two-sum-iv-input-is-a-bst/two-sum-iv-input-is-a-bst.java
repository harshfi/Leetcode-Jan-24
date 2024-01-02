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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set= new HashSet<>();
       
        find(root,set);
        for(int i : set){
            if(set.contains(k-i) && k-i != i) return true;
        }
        return false;
        
    }
    public void find(TreeNode root,Set<Integer> set){
        if(root==null) return;

        set.add(root.val);
        find(root.left,set);
        find(root.right,set);



    }
}
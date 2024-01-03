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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
       return build(nums,0,nums.length-1);
        
    }
    public TreeNode build(int nums[],int s, int e){
        if(s<0 || e>=nums.length || s>e) return null;

        TreeNode node = new TreeNode();
        int i=max(nums, s, e);
        node.val=nums[i];

        TreeNode left= build(nums,s,i-1);
        TreeNode right= build(nums,i+1,e);
        node.left=left;
        node.right=right;
        return node;

    }
    public int max(int [] num, int s , int e){
        int max=s;
        for(int i=s+1;i<=e;i++){
            if(num[max]<num[i]) max=i;
        }
        return max;
    }

}
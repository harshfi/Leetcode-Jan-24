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
    public List<Integer> largestValues(TreeNode root) {

        Queue <TreeNode> q= new LinkedList<>();
        
        if(root==null) return new ArrayList<>();
        List<Integer> ans= new ArrayList<>();

        q.add(root);

        while(!q.isEmpty()){
            int max=Integer.MIN_VALUE;

            int size= q.size();
            for(int i=0;i<size;i++){
                TreeNode r= q.remove();
                if(r.left!=null) q.add(r.left);
                if(r.right!=null) q.add(r.right);
                if(r.val> max) max= r.val;
            }
            ans.add(max);

        }
        return ans;
        
    }
}
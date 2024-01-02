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
    List<List<Integer>> list= new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
      list= new ArrayList<>();
      if(root==null) return new ArrayList<>();
      find(root,targetSum,new ArrayList<>());
      return list;
    }
    public void find(TreeNode root, int targetSum,List<Integer> l){
          
          if(root==null) return;

          if(root.left==null && root.right==null && targetSum-root.val==0){
              l.add(root.val);
              list.add(new ArrayList(l));
              l.remove(l.size()-1);
              return;
          }
           
           l.add(root.val);
           find(root.left,targetSum-root.val,l);
           find(root.right,targetSum-root.val,l);

           l.remove(l.size()-1);


    }
}
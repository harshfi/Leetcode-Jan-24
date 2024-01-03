class Solution {
    public TreeNode insertIntoMaxTree(TreeNode root, int val){
       // added at the last
       if(root == null) return new TreeNode(val);
       // ex1
       // if the val is greater than all the elements already present 
       // in the tree than surely that val is our root node 
       // and all the values must come to the left subtree..
       // [1,4,2,3] --> [1,4,2,3|5] val = 5
       // 5 is maxm so left = [1,4,2,3] right = []
       // why not right subtree ? 
       // just find the inorder of the ans you will get the idea 
       // [1,4,2,3|5] see 5 is at the last if you add [1,4,2,3] to 
       // right of val and than find the inorder you will get 
       // [5....] 5 at first position and we dont want that
       
         if(val > root.val){
           TreeNode newRoot = new TreeNode(val);
           newRoot.left = root;
           return newRoot;
         }

       // if val is not greater than root.val that means simply
       // the val will be added to the rightsubtree 
       // [2,1,5,4] --> [2,1,5,4|3] val = 3
       // 5 is maxm so left = [2,1] right = [4,3]
       
       // [2,1,5,3] --> [2,1,5,3|4] val = 4
       // 5 is maxm so left = [2,1] right = [3,4]
       
         root.right = insertIntoMaxTree(root.right,val);
         return root;
    }
}
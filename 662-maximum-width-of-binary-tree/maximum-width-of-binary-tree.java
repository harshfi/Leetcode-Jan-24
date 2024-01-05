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
 public class Pair{
     int pos;
    //  int right;
     TreeNode node;
     
     Pair(int left, TreeNode node){
         this.pos=left;
        
         
         this.node= node;
     }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue <Pair> q= new LinkedList<>();
        int Cmax=0;
        if(root==null) return 0;
        Pair pp= new Pair(1,root);
        q.add(pp);
        int h=1;
        while(!q.isEmpty()){

            int count=0;
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;

            int size=q.size();
            for(int i=0;i<size;i++){
                Pair p=q.remove();
                if(p.pos < min) min= p.pos;
                if(p.pos> max) max= p.pos;

                if(p.node.left!=null){
                   Pair g = new Pair(p.pos*2,p.node.left); 
                   q.add(g);
                }
                if(p.node.right!=null){
                   Pair g = new Pair(p.pos*2+1,p.node.right); 
                   q.add(g);

                }
               
                System.out.print(p.node.val+" "+p.pos+"          ");

            }
            
            System.out.println();
            Cmax= Math.max(Cmax,Math.abs(max-min)+1);
        }
        return Cmax;

       
        
    }
}
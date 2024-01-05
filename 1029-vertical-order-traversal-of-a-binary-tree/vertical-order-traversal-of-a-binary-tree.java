/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class Pair {
    int pos;
     int h;
    TreeNode node;

    Pair(int left, TreeNode node) {
        this.pos = left;

        this.node = node;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        TreeMap <Integer, List<Integer>> map= new TreeMap<>();
       
        if (root == null)
            return new ArrayList();
        Pair pp = new Pair(0, root);
        q.add(pp);
        TreeMap <Integer, List<Integer>> m;

        while (!q.isEmpty()) {

            int count = 0;
            int size = q.size();
             m = new TreeMap<>();
            for (int i = 0; i < size; i++) {
                Pair p = q.remove();

                if(m.containsKey(p.pos)){
                   m.get(p.pos).add(p.node.val);
                //    System.out.print( m.get(p.pos));
                }
                else{
                     m.put(p.pos,new ArrayList());
                     m.get(p.pos).add(p.node.val);
                    //  System.out.print(p.node.val+" jjj  ");
                }
                //  System.out.println(p.node.val);

                if (p.node.right != null) {
                    Pair g = new Pair(p.pos + 1, p.node.right);
                    q.add(g);

                }

                if (p.node.left != null) {
                    Pair g = new Pair(p.pos - 1, p.node.left);
                    q.add(g);
                }
                
            }
            for(int a : m.keySet())
        {
            List<Integer> t= m.get(a);
             
            // System.out.println(a+" "+map.get(a));
            
            Collections.sort(m.get(a)); 
          
            for(int i=0;i<t.size();i++){
                if(map.containsKey(a)){
                   map.get(a).add(t.get(i));
                //    System.out.print( m.get(p.pos));
                }
                else{
                     map.put(a,new ArrayList());
                     map.get(a).add(t.get(i));
                    //  System.out.print(p.node.val+" jjj  ");
                }
                 
            }
            

        }

           
            
        }
        List<List<Integer>> list= new ArrayList<>();
       for(int a : map.keySet())
        {
            List<Integer> t= map.get(a);
           
            list.add(new ArrayList<>(t));

        }
        return list;

    }
}
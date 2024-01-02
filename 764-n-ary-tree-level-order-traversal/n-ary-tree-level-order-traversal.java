/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
    Queue <Node> q= new LinkedList<>();
    List<List<Integer>> ans =new ArrayList<>();
    if(root==null) return new ArrayList<>();

    q.add(root);
    
    while(! q.isEmpty()){

        List <Node> l= new ArrayList<>();
        List <Integer> list = new ArrayList<>();

        while (!q.isEmpty()){

            Node r = q.remove();
            list.add(r.val);

             for(int i=0;i<r.children.size();i++){
                 l.add(r.children.get(i));
             }
        }

        ans.add(list);

        for(Node r : l){
            q.add(r);
        }
    }
    return ans;
        
    }
}
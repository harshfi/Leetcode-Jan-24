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
    List<Integer> ans= new ArrayList<>();
    public List<Integer> preorder(Node root) {
        ans= new ArrayList<>();
        find(root);
        return ans;

        
    }
    public void find(Node root){
        if(root==null)return ;

        ans.add(root.val);

        for(Node r : root.children){
         find(r);
        }
    }
}
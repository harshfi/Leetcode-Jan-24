class Solution {
    int maxDepth = Integer.MIN_VALUE;
    TreeNode result = null;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        postOrder(root, 0);
        return result;
    }
    public int postOrder(TreeNode node, int deep) {
        if (node == null) {
            return deep;
        }
        int left = postOrder(node.left, deep + 1);
        int right = postOrder(node.right, deep + 1);
        int curDepth = Math.max(left, right);
        maxDepth = Math.max(maxDepth, curDepth);
        if (left == maxDepth && right == maxDepth) {
            result = node;
        }
        return curDepth;
    }
}
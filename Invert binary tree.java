class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode newTree = new TreeNode(root.val);
        newTree.left = invertTree(root.right);
        newTree.right = invertTree(root.left);
        return newTree;
    }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode left = p.val < q.val ? p : q;
        TreeNode right = p.val < q.val ? q : p;
        return LCAHelper(root,left,right);
    }
    public TreeNode LCAHelper(TreeNode root, TreeNode p, TreeNode q) {
        
        if(p.val > root.val){
            return LCAHelper(root.right, p, q);
        }
        
        if(q.val < root.val){
            return LCAHelper(root.left, p,q);
        }
        
        return root;
           
    }
}

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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;

        // Check if the tree starting at current 'root' is identical to 'subRoot'
        if(isSameTree(root, subRoot)) return true;

        // Otherwise, check if 'subRoot' exists in the left or right subtrees
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // Checks if two trees are identical in structure and values
    private boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        
        // If one is null and the other isn't, or values don't match -> Not identical
        if(p == null || q == null || p.val != q.val) 
            return false;
        
        // Recursively verify both left and right subtrees match
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
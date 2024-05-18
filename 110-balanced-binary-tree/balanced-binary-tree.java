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
//balanced binary tree
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        return true;
        return Math.abs(height(root.left) - height(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);  
    }

    private int height(TreeNode node) {
      
        if (node == null) {
            return 0;
        }

        int[] lh = new int[1];
        int[] rh = new int[1];
        lh[0] = height(node.left);
        rh[0] = height(node.right);
       // diameter[0] = Math.max(diameter[0], lh[0] + rh[0]);
        return 1 + Math.max(lh[0], rh[0]);
    }
}
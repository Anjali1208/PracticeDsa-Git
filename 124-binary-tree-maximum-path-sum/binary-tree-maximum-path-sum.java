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
    public int maxPathSum(TreeNode root) {
        int maxS[]={Integer.MIN_VALUE};
        height(root,maxS);
        return maxS[0];
        
    }

    private int height(TreeNode node,int[]maxS) {
      
        if (node == null) {
            return 0;
        }

        int[] lh = new int[1];
        int[] rh = new int[1];
        lh[0] = Math.max(0,height(node.left,maxS));
        rh[0] = Math.max(0,height(node.right,maxS));
       maxS[0] = Math.max(maxS[0], lh[0] + rh[0]+node.val);
        return Math.max(lh[0], rh[0])+node.val;
    }
}
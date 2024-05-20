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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> ans=new  ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root ==null)
        {
            return ans;
        }
        boolean flag=true;
        q.add(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            //System.out.println("N="+n);
            //boolean flag=true;
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode node=q.poll();
                // int ind=flag?i:(n-1-i);
                // System.out.println(ind);
                // temp.add(ind,node.val);
                if(!flag)
                temp.add(0,node.val);
                else
                temp.add(node.val);
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                if(node.right!=null)
                {
                    q.add(node.right);
                }
              // flag=!flag;
            }
            flag=!flag;
             ans.add(temp);
        }

        
        return ans;  
    }
}
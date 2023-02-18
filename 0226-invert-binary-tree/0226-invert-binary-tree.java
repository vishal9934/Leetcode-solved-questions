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
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            TreeNode curr=temp.left;
            temp.left=temp.right;
            temp.right=curr;

            if(temp.left!=null)
            q.offer(temp.left);

            if(temp.right!=null)
            q.offer(temp.right);
        }
        return root;
    }
}
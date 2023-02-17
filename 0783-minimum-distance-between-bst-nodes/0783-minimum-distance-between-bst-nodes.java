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
    TreeNode previous=null;
    int min=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        Inorder(root);
       return  min;
    }
    void Inorder(TreeNode root){
        if(root==null) return;
        
        Inorder(root.left);
        
        if(previous!=null){
            min=Math.min(min,root.val-previous.val);
        }
        previous=root;
        Inorder(root.right);
    }
}
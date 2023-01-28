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
    int count=0;
    public int averageOfSubtree(TreeNode root) {
        if(root==null) return 0;
        
        postOrder(root);
        return count;
    }
    int[] postOrder(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        int []left=postOrder(root.left);
        int []right=postOrder(root.right);
        
       int totalsum=left[0]+right[0]+root.val;
        int totalnode=left[1]+right[1]+1;
        
        if(totalsum/totalnode==root.val){
            count++;
        }
        return new int[]{totalsum,totalnode};
        
        }
}
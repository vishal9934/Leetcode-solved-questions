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
    int ans=Integer.MIN_VALUE;
    int helper(TreeNode root,int k){
        
        if(root==null) return ans;
        
        helper(root.left,k);
        count++;
        if(count==k) ans=root.val;
        
        helper(root.right,k);
        
        return ans;
    }
    public int kthSmallest(TreeNode root, int k) {
        
       return helper(root,k);
    }
}
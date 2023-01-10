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
    TreeNode helper(int[] nums,int low,int high){
        //  int low=0;
        // int high=nums.length-1;
        
        if(low>high) return null;
        
        int mid=(low+high)/2;
        TreeNode newNode=new TreeNode(nums[mid]);
        newNode.left=helper(nums,low,mid-1);
        newNode.right=helper(nums,mid+1,high);
        return newNode;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        
       return helper(nums,0,nums.length-1);
    }
}
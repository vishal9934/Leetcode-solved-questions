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
    public int maxValue(int nums[],int start,int end){
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=start;i<=end;i++){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }
        return index;
    }
    TreeNode helper(int nums[],int start,int end){
        if(start>end) return null;
        
        int position=maxValue(nums,start,end);
        TreeNode root=new TreeNode(nums[position]);
        root.left=helper(nums,start,position-1);
        root.right=helper(nums,position+1,end);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums,0,nums.length-1);
    
    }
}
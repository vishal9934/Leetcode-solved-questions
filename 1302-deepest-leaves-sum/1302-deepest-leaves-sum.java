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
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
       int depth=maxDepth(root);
        findsum(root,1,depth);
        return sum;
    }
    
    int maxDepth(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    void findsum(TreeNode root,int level,int depth){
        if(root!=null){
            if(level==depth){
                sum+=root.val;
            }
            findsum(root.left,level+1,depth);
            findsum(root.right,level+1,depth);
            
        }
        
    }
}
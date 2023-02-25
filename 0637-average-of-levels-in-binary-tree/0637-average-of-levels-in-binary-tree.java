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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        
        if(root==null) return ans;
        
        q.add(root);
        
        while(!q.isEmpty()){
            int n=q.size();
            double sum=0.0;
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                sum+=temp.val;
                
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            ans.add(sum/n);
        }
        return ans;
        
    }
}
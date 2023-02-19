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
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        int level=0;

        if(root==null) return ans;
        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> list=new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                list.add(temp.val);

                if(temp.left!=null)
                 q.offer(temp.left);

                 if(temp.right!=null)
                 q.offer(temp.right);
            }
            if(level%2==1){
                Collections.reverse(list);
            }
            ans.add(list);
            level++;
        }
        return ans;
    }
}
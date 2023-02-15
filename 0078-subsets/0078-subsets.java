class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> ans=new ArrayList<>();
        
        rec(nums,0,ans,new ArrayList<>());
        return ans;
    }
    void rec(int []nums,int index,List<List<Integer>> ans,List<Integer> ds ){
        
        if(index==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        ds.add(nums[index]);
        rec(nums,index+1,ans,ds);
        ds.remove(ds.size()-1);
        rec(nums,index+1,ans,ds);
        
    }
}
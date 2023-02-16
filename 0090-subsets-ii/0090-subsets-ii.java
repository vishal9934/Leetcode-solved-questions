class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
        
        rec(nums,0,ans,new ArrayList<>());
            return ans;
    }
    void rec(int []arr,int index, List<List<Integer>> ans,List<Integer> ds){
        
        Arrays.sort(arr);
        ans.add(new ArrayList<>(ds));
        
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]) continue;
            
            ds.add(arr[i]);
            rec(arr,i+1,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}
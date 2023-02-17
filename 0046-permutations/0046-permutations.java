class Solution {
    void swap(int i,int j,int arr[]){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        rec(0,nums,ans);
        return ans;
    }
    void rec(int index,int arr[],List<List<Integer>> ans){
        
        if(index==arr.length){
            
            List<Integer> ds=new ArrayList<>();
            
            for(int i=0;i<arr.length;i++){
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<arr.length;i++){
            swap(i,index,arr);
            rec(index+1,arr,ans);
             swap(i,index,arr);
        }
    }
    
}
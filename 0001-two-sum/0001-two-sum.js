class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        int ans[]=new int[2];
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<n;i++){
            if(mp.containsKey(target-arr[i])){
                ans[0]=mp.get(target-arr[i]);
                ans[1]=i;
                return ans;
            }
            
                mp.put(arr[i],i);
            
        }
        return ans;
    }
}
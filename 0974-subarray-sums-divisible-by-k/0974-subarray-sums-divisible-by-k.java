class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int sum=0;
        int rem=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            rem=sum%k;

            if(rem<0) rem+=k;  //if remainder is found negative;

            if(mp.containsKey(rem)){
               count+= mp.get(rem);
            }
            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
        return count;
    }
}
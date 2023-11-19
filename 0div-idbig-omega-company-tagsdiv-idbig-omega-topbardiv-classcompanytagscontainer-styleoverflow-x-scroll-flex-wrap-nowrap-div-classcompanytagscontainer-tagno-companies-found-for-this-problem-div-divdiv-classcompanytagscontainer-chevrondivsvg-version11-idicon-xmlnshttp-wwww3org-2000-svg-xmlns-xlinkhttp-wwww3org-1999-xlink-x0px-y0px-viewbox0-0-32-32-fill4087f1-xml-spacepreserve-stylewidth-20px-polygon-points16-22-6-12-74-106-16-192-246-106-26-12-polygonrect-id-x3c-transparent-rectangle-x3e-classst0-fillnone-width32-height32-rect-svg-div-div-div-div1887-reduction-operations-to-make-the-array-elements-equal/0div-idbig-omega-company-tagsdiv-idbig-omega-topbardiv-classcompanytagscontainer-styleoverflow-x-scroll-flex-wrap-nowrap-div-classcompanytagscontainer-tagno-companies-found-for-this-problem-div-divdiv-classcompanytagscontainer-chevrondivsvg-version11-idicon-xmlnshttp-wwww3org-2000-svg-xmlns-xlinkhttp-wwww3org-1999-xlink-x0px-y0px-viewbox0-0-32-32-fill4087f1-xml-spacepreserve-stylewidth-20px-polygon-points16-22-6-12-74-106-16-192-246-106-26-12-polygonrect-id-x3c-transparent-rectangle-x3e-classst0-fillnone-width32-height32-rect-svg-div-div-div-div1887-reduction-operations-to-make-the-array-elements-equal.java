class Solution {
    public int reductionOperations(int[] nums) {
        int[] freq = new int[50001];
        for(int num:nums){
            freq[num]++;
        }

        int count=0, temp=0;
        for(int i=50000; i>=1; i--){
            if(freq[i] > 0){
                temp += freq[i];
                count += temp-freq[i];
            }
        }
        return count;
    }
}
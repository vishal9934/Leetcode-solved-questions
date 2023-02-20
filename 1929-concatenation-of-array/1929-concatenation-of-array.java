class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int newArr[]=new int[2*n];
        
        for(int i=0;i<n*2;i++){
            newArr[i]=nums[i%n];
        }
        return newArr;
    }
}
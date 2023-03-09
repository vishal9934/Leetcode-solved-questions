class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sumf=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;int k=1;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(k%2==1){
                    sumf+=sum;
                }
                 k++;
            }
           
        }
        return sumf;
    }
}
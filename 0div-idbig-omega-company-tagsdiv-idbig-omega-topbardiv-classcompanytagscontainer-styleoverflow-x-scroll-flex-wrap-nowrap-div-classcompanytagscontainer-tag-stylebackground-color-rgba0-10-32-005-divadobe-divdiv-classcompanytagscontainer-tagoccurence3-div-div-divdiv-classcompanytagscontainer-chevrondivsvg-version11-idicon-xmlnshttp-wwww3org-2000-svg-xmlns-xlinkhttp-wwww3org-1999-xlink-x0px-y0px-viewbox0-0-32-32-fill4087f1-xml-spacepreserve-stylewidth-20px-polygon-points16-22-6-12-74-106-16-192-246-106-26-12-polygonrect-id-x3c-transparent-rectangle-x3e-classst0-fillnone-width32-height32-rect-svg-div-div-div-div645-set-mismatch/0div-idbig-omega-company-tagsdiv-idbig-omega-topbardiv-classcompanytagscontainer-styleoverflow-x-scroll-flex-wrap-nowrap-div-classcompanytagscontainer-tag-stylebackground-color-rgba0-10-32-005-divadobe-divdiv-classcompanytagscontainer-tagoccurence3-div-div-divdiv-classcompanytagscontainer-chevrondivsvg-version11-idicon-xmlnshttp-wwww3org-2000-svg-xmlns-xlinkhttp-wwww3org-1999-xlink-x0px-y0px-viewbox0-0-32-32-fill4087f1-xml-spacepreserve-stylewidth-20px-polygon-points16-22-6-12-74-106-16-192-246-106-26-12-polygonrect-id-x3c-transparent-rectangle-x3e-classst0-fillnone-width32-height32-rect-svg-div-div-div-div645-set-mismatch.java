class Solution {
    public int[] findErrorNums(int[] nums) {
        //result array
        int[] res= new int[2];
        //freq array
        int[] freq=new int[10001];

        //set frequencies for elements
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }

        //find the elements with freq 0 and 2
        for(int i=1; i<freq.length; i++){
                //freq 0
                if(freq[i]==0){
                    res[1]=i;
                }
                //freq 2
                else if(freq[i]==2){
                    res[0]=i;
                }
                //if both elements found, break
                if(res[0]!=0 && res[1]!=0){
                    break;
                }            
        }
        //return result
        return res;
    }
}
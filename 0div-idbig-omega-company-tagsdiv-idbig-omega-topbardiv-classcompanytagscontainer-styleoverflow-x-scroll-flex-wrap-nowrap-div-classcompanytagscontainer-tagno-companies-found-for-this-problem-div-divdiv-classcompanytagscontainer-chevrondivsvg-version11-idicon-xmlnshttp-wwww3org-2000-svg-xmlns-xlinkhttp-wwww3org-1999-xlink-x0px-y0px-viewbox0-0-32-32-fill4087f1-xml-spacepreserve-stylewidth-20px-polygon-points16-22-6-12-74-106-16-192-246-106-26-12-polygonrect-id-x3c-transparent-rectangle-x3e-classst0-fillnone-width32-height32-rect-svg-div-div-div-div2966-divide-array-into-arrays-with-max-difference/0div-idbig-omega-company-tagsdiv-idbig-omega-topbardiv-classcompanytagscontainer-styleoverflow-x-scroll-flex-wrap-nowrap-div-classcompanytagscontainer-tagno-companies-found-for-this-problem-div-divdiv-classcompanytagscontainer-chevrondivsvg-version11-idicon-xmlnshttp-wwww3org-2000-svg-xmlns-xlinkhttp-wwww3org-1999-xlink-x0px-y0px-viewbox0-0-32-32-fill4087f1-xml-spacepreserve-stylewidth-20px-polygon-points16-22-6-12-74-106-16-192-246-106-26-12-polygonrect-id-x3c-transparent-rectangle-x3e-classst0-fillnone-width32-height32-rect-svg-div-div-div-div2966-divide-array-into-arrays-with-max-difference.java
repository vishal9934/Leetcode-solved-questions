class Solution {
    public int[][] divideArray(int[] arr, int k) {
        Arrays.sort(arr);
	        for(int i=0;i<arr.length;i+=3){
	            if(!((Math.abs(arr[i]-arr[i+2]))<=k)){
	                return new int[0][0];
	            }
	        }
	        int row=arr.length/3,idx=0,pointer=3;
	        int[][] ans=new int[row][3];
	        
	        for(int i=0;i<arr.length;i+=3){
	            int[] dup=insert(arr,i,pointer);
	            pointer+=3;
	            ans[idx]=dup;
	            idx++;
	        }
	        return ans;
    }
    public int[] insert(int[] arr,int idx,int k1){
        int[] ans=new int[3];
	    int pointer=0;
	    for(int i=idx;i<k1;i++){
	        ans[pointer++]=arr[i];
	    }
	    return ans;
    }
}
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE,high=0,res=Integer.MAX_VALUE;
        for(int i=0;i<weights.length;i++){
            high+=weights[i];  //noOfDays =1 then max capacity is sum of the weights
            low=Math.max(low,weights[i]); // noOfDays = sizeOfarray then max limit will be max ele in array
        }
        while(low<=high){
            int mid=(low+high)/2;
            // find if mid is our possible sol
            if(isPoss(mid,weights,days)){  // if it is ,the decrease the search space to get another possible min solution
                res = Math.min(res,mid);
                high=mid-1;
            }
            else low=mid+1; // if not,increse the search space 
        }
        return res;
    }
    // if any of capacity(mid) has a less no.of days to ship compare to given days,means
	// that our limit is more to segregrate the weight over given days,then decrease the search space
	// if our limit is less that can be allocated in more of days ,then increase the search space
    public boolean isPoss(int mid,int[] A,int B){
        int sumOfweight = 0;
        int sumOfDays =1;
        
        for(int i=0;i<A.length;i++){
            if(A[i]>mid) return false;
            if(sumOfweight+A[i]>mid){
                sumOfweight=A[i];
                sumOfDays++;
            }
            else sumOfweight+=A[i];
        }
        return sumOfDays<=B;
    }
	// do dry run,so u can understand it better.
}
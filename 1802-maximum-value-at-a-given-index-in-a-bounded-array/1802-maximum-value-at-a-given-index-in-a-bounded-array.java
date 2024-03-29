class Solution {
   public int maxValue(int n, int index, int maxSum) {
        long lo=1 , hi = Integer.MAX_VALUE , result=0;
        
        while(lo<=hi){
            
            long mid= lo + (hi-lo)/2;
            
            long left=Sum(Math.min(index,mid-1),mid); //  here using 0 not 4 as number of element in left  sum will handle that negative part array will look like [0,0,0,0,1,2]. if i choose number of element is left as 4 array will look like [-3,-2,-1,0,1,2]
            left+=Math.max(0,index-mid+1);  //[1,1,1,1,1,2] to make these zeroes one
            
            long right=Sum(Math.min(n-index-1,mid-1),mid);
            right+=Math.max(0,(n-index-mid));
                
            if(left+right+mid<=maxSum){
                result=mid;  //mid is valid but not sure its the maximum answer or not . so lo=mid+1 in next step
                lo=mid+1;
            }else{
                hi=mid-1;
            }    
        }
        
        return (int)result;
    }
    
   private long Sum(long noofElement,long x){
        return x*(noofElement) - ((noofElement*(noofElement+1))/2);
    }

}
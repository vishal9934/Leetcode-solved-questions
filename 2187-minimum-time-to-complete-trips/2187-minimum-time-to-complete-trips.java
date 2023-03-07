// class Solution {
//     boolean check(long mid,int[] time,int totalTrips){
//         long trip=0;
//         for(int x:time){
//             trip+=totalTrips/x;
//         }
//         if(trip>=mid){
//             return true;
//         }
//         return false;
//     }
//     public long minimumTime(int[] time, int totalTrips) {
//         long low=Long.MAX_VALUE;
//         long min=Long.MAX_VALUE;
        
//         for(int x:time){
//             low =Math.min(low,x);
//             min=Math.min(min,x);
            
//         }
//         long high=min*totalTrips;
        
        
//         while(low<=high){
//             long mid=low+(high-low)/2;
            
//             if(check(mid,time,totalTrips)){
//                 high=mid-1;
//             }
//             else{
//                 low=mid+1;
//             }
//         }
//         return low;
//     }
// }




class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low=Long.MAX_VALUE;
        long high=0;
        long min=Long.MAX_VALUE;
        for(int it:time){
            low=Math.min(low,it);
            min=Math.min(min,it);
        }
        high=totalTrips*min;
        while(low<high){
            long mid=low+(high-low)/2;
            if(blackbox(mid,totalTrips,time)){
                high=mid;
            }
            else
                low=mid+1;
        }
        return low;
    }
    public boolean blackbox(long isvalidtime,int totalTrips,int[] time){
        long trips=0;
        for(int it:time){
            trips+=isvalidtime/it;
        }
        if(trips>=totalTrips)
            return true;
        return false;
    }
}
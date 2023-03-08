class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lowspeed = 1;
        int highspeed = 1000000000;

        while(lowspeed < highspeed){
            int midspeed = lowspeed + (highspeed - lowspeed)/2;

            if(timetaken(piles, midspeed) > h){
                lowspeed = midspeed + 1;
            }else{
                highspeed = midspeed;
            }
        }
        return lowspeed;
    }

    public long timetaken(int[] piles, int speed){
        long timetaken = 0;
        for(int p : piles){
            if(p % speed != 0){
                timetaken += p / speed + 1;
            }else{
                timetaken += p / speed;
            }
        }

        return timetaken;
    }
}

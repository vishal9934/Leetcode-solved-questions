class Solution {
    public int buyChoco(int[] prices, int money) {
        int firstMin = Integer.MAX_VALUE;
        int SecMin= Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<SecMin){
                if(prices[i]<firstMin){
                    SecMin = firstMin;
                    firstMin = prices[i];
                }else{
                    SecMin=prices[i];
                }
            }
        }
        if((firstMin+SecMin)<=money){
            return money-(firstMin+SecMin);
        }
        return money;
    }
}
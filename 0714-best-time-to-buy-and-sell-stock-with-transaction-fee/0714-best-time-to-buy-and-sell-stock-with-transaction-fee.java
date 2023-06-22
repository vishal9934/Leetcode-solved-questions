class Solution {
    public static int maxProfit(int[] prices,int fee) {
        int obsp=-prices[0];//obsp->Old buying state profit
        int ossp=0;//->Old selling state profit
        for (int i = 1; i <prices.length ; i++) {
            int nbsp=0;//->new buying state profit
            int nssp=0;//->new selling state profit
            if(obsp>ossp-prices[i])
            { 
                nbsp= obsp;
            }
            else
                nbsp=ossp-prices[i];

            if(obsp+prices[i]-fee>ossp)
            {
                nssp= obsp+prices[i]-fee;
            }
            else {
                nssp = ossp ;

            }
            obsp=nbsp;
            ossp=nssp;
        }
        return ossp;
    }
}
class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n<=2) return 1;
        
        int sum=0;
        int a=0;
        int b=1;
        int c=1;
        int index=3;
        while(index<=n){
            sum=a+b+c;
            index++;
            a=b;
            b=c;
            c=sum;
        }
        return sum;
    }
}
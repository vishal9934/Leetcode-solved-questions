class Solution {
    public int heightChecker(int[] heights) {
        int expected[]=new int[heights.length];
        int ans=0;
        
        for(int i=0;i<heights.length;i++){
            expected[i]=heights[i];
        }
        Arrays.sort(expected);
        
         for(int i=0;i<heights.length;i++){
             if(heights[i]!=expected[i]){
                 ans++;
             }
         }
        return ans;
    }
}
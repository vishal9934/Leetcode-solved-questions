class Solution {
    public int maxArea(int[] height) {
        
        int max=0;
        int l=0;
        int h=height.length-1;
        
        while(l<h){
            int leftHeight=height[l];
            int rightHeight=height[h];
            
            int min_height=Math.min(leftHeight,rightHeight);
            
            max=Math.max(max,min_height*(h-l));
            
            if(leftHeight<rightHeight){
                l++;
            }
            else{
                h--;
            }
        }
        return max;
    }
}
            
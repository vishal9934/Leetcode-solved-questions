class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> mp=new HashMap<>();
        
        for(int i=0;i<heights.length;i++){
            mp.put(heights[i],names[i]);
        }
        
        Arrays.sort(heights);
        String ans[]=new String[heights.length];
        int index=0;
        
        for(int i=heights.length-1;i>=0;i--){
            ans[index++]=mp.get(heights[i]);
        }
        return ans;
    }
}
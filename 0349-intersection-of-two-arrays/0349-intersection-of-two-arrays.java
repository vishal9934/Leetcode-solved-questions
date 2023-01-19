class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        
        
        for(int i=0;i<nums2.length;i++){
            mp.put(nums2[i],mp.getOrDefault(nums2[i],0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(mp.containsKey(nums1[i])){
                set.add(nums1[i]);
            }
        }
        int ans[]=new int[set.size()];
        int idx=0;
        for(int i:set){
            ans[idx++]=i;
        }
        return ans;
    }
}
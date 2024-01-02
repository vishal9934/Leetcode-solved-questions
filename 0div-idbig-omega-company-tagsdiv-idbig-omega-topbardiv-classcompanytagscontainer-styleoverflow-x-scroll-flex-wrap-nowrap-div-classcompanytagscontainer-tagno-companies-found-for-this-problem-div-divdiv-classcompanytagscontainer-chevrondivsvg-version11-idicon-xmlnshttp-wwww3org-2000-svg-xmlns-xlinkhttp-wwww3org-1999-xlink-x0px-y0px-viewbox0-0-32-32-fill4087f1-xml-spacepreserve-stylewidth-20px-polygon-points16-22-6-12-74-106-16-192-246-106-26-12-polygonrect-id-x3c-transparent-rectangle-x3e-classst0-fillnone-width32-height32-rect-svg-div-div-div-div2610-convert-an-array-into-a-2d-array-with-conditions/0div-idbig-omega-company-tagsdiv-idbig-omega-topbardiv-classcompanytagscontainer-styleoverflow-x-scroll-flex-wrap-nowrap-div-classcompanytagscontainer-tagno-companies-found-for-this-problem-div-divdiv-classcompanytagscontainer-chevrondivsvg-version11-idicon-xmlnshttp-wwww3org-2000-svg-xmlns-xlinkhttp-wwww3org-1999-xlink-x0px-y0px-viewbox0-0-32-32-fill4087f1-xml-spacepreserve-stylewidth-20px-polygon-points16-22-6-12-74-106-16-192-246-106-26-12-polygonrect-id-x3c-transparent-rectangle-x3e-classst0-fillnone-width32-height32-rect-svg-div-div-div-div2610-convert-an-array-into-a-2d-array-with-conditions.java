class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        //Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        int count=0;
        while(count!=nums.length){
            ArrayList<Integer> l=new ArrayList<Integer>();
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]!=-1 && ! l.contains(nums[i]))
                {
                    l.add(nums[i]);
                    count++;
                    nums[i]=-1;
                }
            }
            if(l.size()==0)
            break;
            list.add(l);
        }
        return list;
    }
}

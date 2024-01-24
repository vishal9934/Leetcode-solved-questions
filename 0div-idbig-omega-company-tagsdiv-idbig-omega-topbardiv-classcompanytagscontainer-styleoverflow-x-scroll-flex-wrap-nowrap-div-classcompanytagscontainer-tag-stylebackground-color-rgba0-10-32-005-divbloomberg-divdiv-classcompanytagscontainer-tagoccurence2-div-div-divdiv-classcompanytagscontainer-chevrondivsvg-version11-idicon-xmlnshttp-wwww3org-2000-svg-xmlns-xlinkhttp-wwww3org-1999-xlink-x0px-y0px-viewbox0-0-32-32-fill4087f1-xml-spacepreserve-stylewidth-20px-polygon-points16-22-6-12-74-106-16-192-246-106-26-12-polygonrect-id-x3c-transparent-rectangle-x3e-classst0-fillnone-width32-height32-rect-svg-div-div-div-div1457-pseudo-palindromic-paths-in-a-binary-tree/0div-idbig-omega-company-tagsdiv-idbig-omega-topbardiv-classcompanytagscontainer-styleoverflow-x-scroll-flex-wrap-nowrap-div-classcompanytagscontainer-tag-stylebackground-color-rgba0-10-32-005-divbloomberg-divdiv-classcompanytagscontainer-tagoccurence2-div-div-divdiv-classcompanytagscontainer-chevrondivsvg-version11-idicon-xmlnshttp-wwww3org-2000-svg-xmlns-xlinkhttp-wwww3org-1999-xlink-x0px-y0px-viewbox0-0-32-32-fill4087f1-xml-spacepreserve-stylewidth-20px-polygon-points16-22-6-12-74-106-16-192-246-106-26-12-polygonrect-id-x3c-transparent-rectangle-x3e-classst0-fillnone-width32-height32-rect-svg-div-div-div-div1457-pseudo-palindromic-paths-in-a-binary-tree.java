class Solution {
    int answer;
    public int pseudoPalindromicPaths (TreeNode root) {
        return palindromeHelper(root, new HashMap<Integer, Integer>());
    }

    static int palindromeHelper(TreeNode root, HashMap<Integer, Integer> map){
        if(root == null){
            return 0;
        }
        map.put(root.val, map.getOrDefault(root.val,0)+1);
        if(root.left == null && root.right == null){
            int val = 0;
            int oddFreq = 0;
            int evenFreq = 0;
            for(int i: map.keySet()){
                val += map.get(i);
                if(map.get(i)%2 == 0){
                    evenFreq += 1;
                }else{
                    oddFreq += 1;
                }
            }

            if(val%2 == 0){
                if(oddFreq >0){
                    return 0;
                }else{
                    return 1;
                }
            }

            return oddFreq == 1 ? 1: 0;
        }

        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();


        //System.out.println("when current is : "+root.val);
        for(int i : map.keySet()){
            //System.out.println(i+"  : "+map.get(i));
            map1.put(i, map.get(i));
            map2.put(i, map.get(i));
        }
        //System.out.println();

        return palindromeHelper(root.left, map1) + palindromeHelper(root.right, map2);
    }
}
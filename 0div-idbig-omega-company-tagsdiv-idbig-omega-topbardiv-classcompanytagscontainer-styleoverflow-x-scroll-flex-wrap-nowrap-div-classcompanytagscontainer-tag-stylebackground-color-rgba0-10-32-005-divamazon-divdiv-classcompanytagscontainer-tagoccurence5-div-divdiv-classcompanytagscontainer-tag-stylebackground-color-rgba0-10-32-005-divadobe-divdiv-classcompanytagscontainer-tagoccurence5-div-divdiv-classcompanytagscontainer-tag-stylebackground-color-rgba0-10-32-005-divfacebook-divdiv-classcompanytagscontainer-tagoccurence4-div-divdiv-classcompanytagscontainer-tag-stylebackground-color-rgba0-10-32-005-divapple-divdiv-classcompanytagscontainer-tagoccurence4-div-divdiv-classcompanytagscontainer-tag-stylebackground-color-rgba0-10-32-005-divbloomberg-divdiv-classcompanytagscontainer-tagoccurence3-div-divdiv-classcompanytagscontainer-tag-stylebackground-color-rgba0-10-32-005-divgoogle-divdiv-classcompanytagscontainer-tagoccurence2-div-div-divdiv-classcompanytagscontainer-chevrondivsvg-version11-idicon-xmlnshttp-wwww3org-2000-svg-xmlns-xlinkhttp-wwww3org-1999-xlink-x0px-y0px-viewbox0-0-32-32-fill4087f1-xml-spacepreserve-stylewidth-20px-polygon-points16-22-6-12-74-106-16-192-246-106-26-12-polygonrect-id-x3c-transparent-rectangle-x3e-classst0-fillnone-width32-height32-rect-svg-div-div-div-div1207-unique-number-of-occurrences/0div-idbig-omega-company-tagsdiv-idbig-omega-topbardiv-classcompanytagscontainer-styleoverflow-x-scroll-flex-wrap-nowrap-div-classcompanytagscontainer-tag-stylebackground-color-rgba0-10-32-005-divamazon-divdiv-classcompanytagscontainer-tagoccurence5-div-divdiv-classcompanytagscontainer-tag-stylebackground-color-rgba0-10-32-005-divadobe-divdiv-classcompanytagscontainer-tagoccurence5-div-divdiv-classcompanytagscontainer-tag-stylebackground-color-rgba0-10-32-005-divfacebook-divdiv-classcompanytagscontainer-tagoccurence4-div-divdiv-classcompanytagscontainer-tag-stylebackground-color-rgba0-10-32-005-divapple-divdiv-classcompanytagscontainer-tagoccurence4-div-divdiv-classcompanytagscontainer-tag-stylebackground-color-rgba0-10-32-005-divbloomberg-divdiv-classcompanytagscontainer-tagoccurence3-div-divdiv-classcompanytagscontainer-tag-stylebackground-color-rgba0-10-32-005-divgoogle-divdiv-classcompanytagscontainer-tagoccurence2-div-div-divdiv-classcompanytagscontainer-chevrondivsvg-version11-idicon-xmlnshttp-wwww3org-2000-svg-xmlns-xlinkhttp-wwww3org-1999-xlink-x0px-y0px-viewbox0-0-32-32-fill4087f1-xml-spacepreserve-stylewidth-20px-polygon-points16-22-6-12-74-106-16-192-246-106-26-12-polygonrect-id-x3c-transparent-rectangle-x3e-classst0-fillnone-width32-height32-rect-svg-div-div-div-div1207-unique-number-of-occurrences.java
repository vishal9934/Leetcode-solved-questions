class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        System.out.print(mp);
        Set<Integer> st=new HashSet<>();
        for(int x:mp.values()){
            if(st.contains(x)) return false;
            st.add(x);
        }
        return true;
    }
}

// class Solution {
//     public boolean uniqueOccurrences(int[] arr) {
//         Map<Integer, Integer> map = new HashMap<>();

//         for (int i : arr) {
//             map.put(i, map.getOrDefault(i, 0) + 1);
//         }

//         Set<Integer> set = new HashSet<>();

//         for (int i : map.keySet()) {
//             if (set.contains(i)) return false;
//             set.add(i);
//             // if (!set.add(i)) return false;
//         }

//         return true;
//     }
// }
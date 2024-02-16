class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1); // Added semicolon at the end of the line
        }
        
        ArrayList<Integer> keysList = new ArrayList<>(map.keySet()); // Changed variable name to keysList to avoid conflict
        Collections.sort(keysList, (a, b) -> {
            int cmp = Integer.compare(map.get(a), map.get(b));
            return cmp; // Added return statement to fix lambda expression
        });

        int count = 0;
        for(int i = 0; i < keysList.size(); i++){
            int freq = map.get(keysList.get(i));
            if(freq <= k){
                k -= freq;
                count++;
            } else {
                break;
            }
        }
        return keysList.size() - count;
    }
}
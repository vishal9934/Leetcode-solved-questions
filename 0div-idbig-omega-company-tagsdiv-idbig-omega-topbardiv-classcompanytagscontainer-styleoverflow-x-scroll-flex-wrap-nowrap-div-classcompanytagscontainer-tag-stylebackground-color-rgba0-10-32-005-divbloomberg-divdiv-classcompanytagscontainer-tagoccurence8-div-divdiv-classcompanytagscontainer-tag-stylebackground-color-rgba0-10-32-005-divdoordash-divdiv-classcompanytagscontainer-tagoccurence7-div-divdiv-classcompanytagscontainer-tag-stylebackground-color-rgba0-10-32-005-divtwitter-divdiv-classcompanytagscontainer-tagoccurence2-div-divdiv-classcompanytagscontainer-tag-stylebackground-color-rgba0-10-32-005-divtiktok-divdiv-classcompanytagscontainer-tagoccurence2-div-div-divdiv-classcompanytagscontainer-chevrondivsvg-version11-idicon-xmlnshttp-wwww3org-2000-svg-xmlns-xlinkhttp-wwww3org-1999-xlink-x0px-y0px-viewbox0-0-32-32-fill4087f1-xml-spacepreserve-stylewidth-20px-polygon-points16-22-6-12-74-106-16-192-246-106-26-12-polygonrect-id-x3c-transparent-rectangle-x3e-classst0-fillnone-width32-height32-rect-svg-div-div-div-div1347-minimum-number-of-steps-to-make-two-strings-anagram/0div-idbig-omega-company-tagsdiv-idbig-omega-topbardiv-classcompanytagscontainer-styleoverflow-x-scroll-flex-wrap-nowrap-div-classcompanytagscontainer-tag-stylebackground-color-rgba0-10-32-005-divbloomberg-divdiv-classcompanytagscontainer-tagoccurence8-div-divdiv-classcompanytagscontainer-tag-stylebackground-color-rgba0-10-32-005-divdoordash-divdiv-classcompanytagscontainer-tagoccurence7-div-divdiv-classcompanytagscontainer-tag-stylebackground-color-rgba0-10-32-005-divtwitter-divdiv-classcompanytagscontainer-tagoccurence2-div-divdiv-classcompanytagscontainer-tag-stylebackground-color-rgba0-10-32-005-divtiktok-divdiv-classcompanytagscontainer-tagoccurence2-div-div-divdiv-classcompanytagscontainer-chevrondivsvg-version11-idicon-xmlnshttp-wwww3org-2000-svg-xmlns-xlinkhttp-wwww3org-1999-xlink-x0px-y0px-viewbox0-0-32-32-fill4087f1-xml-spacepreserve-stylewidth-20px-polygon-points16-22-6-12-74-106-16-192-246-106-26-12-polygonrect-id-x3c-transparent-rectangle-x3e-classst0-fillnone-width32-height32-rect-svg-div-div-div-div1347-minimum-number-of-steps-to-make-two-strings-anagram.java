class Solution {

    static void freq(String s, int arr[]){
        int n = s.length();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            arr[ch-'a']++;
        }
    }
    public int minSteps(String s, String t) {

        int arr1[] = new int[26];
        int arr2[] = new int[26];


        freq(s,arr1);
        freq(t,arr2);

        int ans = 0;

        for(int i=0; i<26; i++){
            if(arr2[i]<arr1[i]) ans = ans+arr1[i]-arr2[i];
        }

        return ans;
    }
}
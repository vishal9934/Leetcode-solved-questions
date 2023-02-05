class Solution {
    public List<Integer> findAnagrams(String s, String p) {
           List<Integer> ans = new ArrayList<>();
        int m = s.length();
        int n = p.length();
        if(n>m)
            return ans;
        
        int[] pfreq = new int[26];
        for(int i=0;i<n;i++){
            pfreq[p.charAt(i) - 'a']++;
        }
        int[] sfreq = new int[26];
        for(int i=0;i<n;i++){
            sfreq[s.charAt(i) - 'a']++;
        }
        if(checkSame(pfreq,sfreq)){
            ans.add(0);
        }
        for(int i = n;i<m;i++){
            sfreq[s.charAt(i) - 'a']++;//including next element
            sfreq[s.charAt(i-n) - 'a']--;//excluding first element
            if(checkSame(sfreq,pfreq)){//checking if same
                ans.add(i-n+1);
            }
        }
        return ans;
    }
    private boolean checkSame(int[] sfreq,int[] pfreq){
        for(int i = 0;i<26;i++){
            if(sfreq[i] != pfreq[i])
                return false;
        }
        return true;

    }
}
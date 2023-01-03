class Solution {
    public int minDeletionSize(String[] s) {
        int n=s.length;//length of row
        int m=s[0].length();//length of column
        int delete=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n-1;j++){
                if(s[j].charAt(i)>s[j+1].charAt(i)){
                    delete++;
                    break;
                }
            }
        }
        return delete;
    
    }
}
// int wordCount = str[0].length();
//         int n = str.length;
//         if(n == 1) return 0;
//         int minDeletion = 0;
//         for(int i=0;i<wordCount;i++){
//             for(int j=0;j<n-1;j++){
//                 if(str[j].charAt(i) > str[j+1].charAt(i)){
//                     minDeletion++;
//                     break;
//                 }
//             }
//         }
//         return minDeletion;
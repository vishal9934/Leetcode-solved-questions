class Solution {
    public boolean detectCapitalUse(String word) {
        int length=word.length();
        int count=0;
        for(int i=0;i<word.length();i++){
            int ch=word.charAt(i);
            if(ch>=65 && ch<=91) count++;
        }

        if(count==length) return true;

        if(count==0) return true;

        if(count==1 && word.charAt(0)>=65 &&  word.charAt(0)<=91)
        return true;

        return false;
    }
}
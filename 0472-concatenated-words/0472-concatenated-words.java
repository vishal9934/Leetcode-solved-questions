class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> aList = new ArrayList<>();
        if(words.length == 0) return aList;
        Set<String> wordSet = new HashSet<>();
        for (String string : words) {
            wordSet.add(string);
        }
        for (String word : words) {
            if(canConcatinate(word, wordSet)) {
                aList.add(word);
            }
        }
        return aList;
    }

    private boolean canConcatinate(String word, Set<String> wSet) {
        for (int i = 1 ; i < word.length(); i++) {
            String prefix = word.substring(0 , i);
            String suffix = word.substring(i , word.length());
            if(wSet.contains(prefix) && (wSet.contains(suffix) || canConcatinate(suffix, wSet))) {
                return true;
            }
        }
        return false;
    }
}
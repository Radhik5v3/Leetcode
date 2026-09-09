class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String sentence : sentences) {
            int spaces = 0;
            // Count the number of spaces in the sentence
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    spaces++;
                }
            }
            // Number of words is spaces + 1
            int wordsCount = spaces + 1;
            if (wordsCount > maxWords) {
                maxWords = wordsCount;
            }
        }
        
        return maxWords;
    }
}
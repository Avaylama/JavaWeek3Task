public class WordCounter {
    public static int countWords(String str) {
        int wordCount = 0;
        boolean inWord = false;
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (Character.isWhitespace(c)) {
                inWord = false; 
            } else if (!inWord) {
                wordCount++;
                inWord = true;
            }
        }
        
        return wordCount;
    }

    public static void main(String[] args) {
        System.out.println(countWords("Java is fun")); 
    }
}

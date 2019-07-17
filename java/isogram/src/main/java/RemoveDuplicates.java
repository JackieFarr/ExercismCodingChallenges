public class RemoveDuplicates {

    StringBuffer removeDuplicates(String word){
        StringBuffer newWord = new StringBuffer();
        int idx;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            idx = word.indexOf(c, i + 1);
            if (idx == -1) {
                newWord.append(c);
            }
        }
        return newWord;
    }
}

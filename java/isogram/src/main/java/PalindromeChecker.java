public class PalindromeChecker {

    boolean IsPalidrome(String word) {
        String cleanWord = word.replace(" ", "").toLowerCase();
        int length = cleanWord.length();
        int forwards = 0;
        int backwards = length - 1;
        while (backwards > forwards) {
            char forwardChar = cleanWord.charAt(forwards++);
            char backwardChar = cleanWord.charAt(backwards--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }
}

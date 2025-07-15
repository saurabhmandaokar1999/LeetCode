class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (!Character.isLetterOrDigit(c)) {
                return false;
            }

            if (isVowel(c)) {
                hasVowel = true;
            } else if (Character.isLetter(c)) {
                hasConsonant = true;
            }
        }
        return hasVowel && hasConsonant;
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}

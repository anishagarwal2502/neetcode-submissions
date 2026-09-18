class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !isAlphaNumeric(s.charAt(i))) i++;
            while (i < j && !isAlphaNumeric(s.charAt(j))) j--;
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

    boolean isAlphaNumeric(char c) {
        return ('a' <= c && c <= 'z') || ('0' <= c && c <= '9');
    }
}

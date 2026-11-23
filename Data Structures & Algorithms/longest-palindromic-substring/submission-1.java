class Solution {
    public String longestPalindrome(String s) {
        int n = s.length(), l = 0, r = 0, ansLen = 1;
        // odd
        int c = 0;

        while (c < n) {
            int left = c - 1, right = c + 1;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (ansLen < right - left + 1) {
                    ansLen = right - left + 1;
                    l = left;
                    r = right;
                }
                left--;
                right++;
            }

            c++;
        }
        c = 0;
        // even
        while (c < n) {
            int left = c - 1, right = c;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (ansLen < right - left + 1) {
                    ansLen = right - left + 1;
                    l = left;
                    r = right;
                }
                left--;
                right++;
            }

            c++;
        }
        return s.substring(l, r + 1);
    }
}

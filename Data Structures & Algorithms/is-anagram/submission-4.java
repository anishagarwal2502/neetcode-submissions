class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            map.put(s.charAt(i), map.getOrDefault(schar, 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(tchar, 0) - 1);
        }

        for (int count : map.values()) {
            if (count != 0)
                return false;
        }
        return true;
    }
}

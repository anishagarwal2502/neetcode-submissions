class Solution {
    public String minWindow(String s, String t) {
        int maxLen = Integer.MAX_VALUE, l = 0, r = 0, target = 0, matched = 0, ansL = 0, ansR = 0;
        if (s.isEmpty() || t.isEmpty() || s.length() < t.length())
            return "";

        Map<Character, Integer> freqT = new HashMap<>(), freqS = new HashMap<>();
        for (char c : t.toCharArray()) {
            freqT.put(c, freqT.getOrDefault(c, 0) + 1);
            target++;
        }

        while (r < s.length()) {
            char c = s.charAt(r);
            // expand
            freqS.put(c, freqS.getOrDefault(c, 0) + 1);
            if (freqT.containsKey(c) && freqS.get(c) <= freqT.get(c))
                matched++;

            // shrink
            while (l <= r && matched == target) {
                if (r - l + 1 < maxLen) {
                    maxLen = r - l + 1;
                    ansL = l;
                    ansR = r;
                }
                char remove = s.charAt(l);
                if (freqT.containsKey(remove) && freqT.get(remove).equals(freqS.get(remove)))
                    matched--;
                freqS.put(remove, freqS.get(remove) - 1);
                l++;
            }
            r++;
        }

        return maxLen == Integer.MAX_VALUE ? "" : s.substring(ansL, ansR + 1);
    }
}

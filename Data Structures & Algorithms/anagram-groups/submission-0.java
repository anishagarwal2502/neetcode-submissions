class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> output = new ArrayList<>();

        for(int i=0;i<strs.length;++i){
            if(strs[i]!=null){
                List<String> sub = new ArrayList<>();
                sub.add(strs[i]);
                
                for(int j=i+1;j<strs.length;++j){
                    if(null!=strs[j] && isAnagram(strs[i],strs[j])){
                        sub.add(strs[j]);
                        strs[j] = null;
                    }
                }
                strs[i] = null;
                output.add(sub);
            }
        }
        return output;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] += 1;
            arr[t.charAt(i) - 'a'] -= 1;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

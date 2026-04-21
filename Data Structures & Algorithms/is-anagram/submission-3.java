class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> smap = new HashMap<>();
        Map<Character,Integer> tmap = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            char schar = s.charAt(i);
            if(smap.keySet().contains(schar)){
                smap.put(schar,smap.get(schar)+1);
            }else{
                smap.put(schar,1);
            }
            char tchar = t.charAt(i);
            if(tmap.keySet().contains(tchar)){
                tmap.put(tchar,tmap.get(tchar)+1);
            }else{
                tmap.put(tchar,1);
            }
        }

        if(smap.keySet().size() != tmap.keySet().size())
            return false;

        for(Character c: smap.keySet()){
            if(!tmap.keySet().contains(c)){
                return false;
            }

            if(!smap.get(c).equals(tmap.get(c))){
                return false;
            }
        }

        for(Character c: tmap.keySet()){
            if(!smap.keySet().contains(c)){
                return false;
            }

            if(!smap.get(c).equals(tmap.get(c))){
                return false;
            }
        }
        
        return true;
        
    }
}

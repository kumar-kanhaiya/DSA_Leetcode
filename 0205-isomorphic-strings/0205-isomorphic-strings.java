class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character , Character > map = new HashMap<>();
        HashMap<Character, Character> reverseMap = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0 ; i < s.length() ; i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map.containsKey(a) && map.get(a) != b) {
                return false;
            }

            if (reverseMap.containsKey(b) && reverseMap.get(b) != a) {
                return false;
            }

            map.put(a, b);
            reverseMap.put(b, a);
        }
        return true;
    }
}
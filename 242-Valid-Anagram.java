class Solution {
    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) return false;
        Map <Character, Integer> mapS = new HashMap<>();
        Map <Character, Integer> mapT = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n ; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (mapS.containsKey(sChar)) {
                mapS.put(sChar, mapS.get(sChar) + 1);
            } else {
                mapS.put(sChar, 1);
            }

            if (mapT.containsKey(tChar)) {
                mapT.put(tChar, mapT.get(tChar) + 1);
            } else {
                mapT.put(tChar, 1);
            }
        }
        return mapS.entrySet().equals(mapT.entrySet());
    }
}
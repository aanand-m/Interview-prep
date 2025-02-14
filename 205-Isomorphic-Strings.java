class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map <Character, Character>  mapST = new HashMap<>();
        Set <Character> check = new HashSet<>();
        for (int i = 0; i<s.length(); i++) {
            char c1 = s.charAt(i) , c2 = t.charAt(i);
            if (!mapST.containsKey(c1)) {
                if (check.add(c2)) { mapST.put(c1,c2);
                }
                else return false;
            }
            else {
                if(!mapST.get(c1).equals(c2)) return false;
            }}
            return true;   
    }
}
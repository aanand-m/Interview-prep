class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.equals(goal)) return true;
            s = rotate(s);
        }
        return false;
    }

    public String rotate (String word) {
        StringBuilder ans = new StringBuilder();
        String half = word.substring(1);
        char fL = word.charAt(0);
        ans.insert(0, half);
        ans.append(fL);
        return ans.toString(); 
    }
}
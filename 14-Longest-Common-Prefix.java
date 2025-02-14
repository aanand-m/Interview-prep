class Solution {
    public String longestCommonPrefix(String[] strs) {
        int arLength = strs.length; 
        int i = 0;
        boolean run = true;
        StringBuilder ans = new StringBuilder();

        while (run) {
            if ( i >= strs[0].length()) {
                run = false; 
                break;
            }
            
            char letter = strs[0].charAt(i);
            for (int j = 1; j < arLength; j++ ) {
                if (i >= strs[j].length() || strs[j].charAt(i) != letter) {
                    run = false;
                    break;
                }
            }
            if (run) {
                ans.append(letter);
                i++;
            }
        }
        return ans.toString();
    }
}
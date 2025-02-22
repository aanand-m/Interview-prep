class Solution {
    public String longestPalindrome(String s) {
        String longestPalindrome = new String();
        for (int i = 0; i<s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub) == true && (sub.length() >= longestPalindrome.length())) {
                    longestPalindrome = sub;
                }
            }
        }
        return longestPalindrome;
    }
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while (low <= high) {
            if (s.charAt(low) == s.charAt(high)) {
                low++;
                high--;
            }
            else return false;
        }
        return true;
    }
}
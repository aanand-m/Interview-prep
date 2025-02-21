class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int curr = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                curr++;
                max = Math.max(curr, max);
            }
            else if (c == ')') curr--;
            else continue;
        }
        return max;
    }
}
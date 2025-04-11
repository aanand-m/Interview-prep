class Solution {
    public int myAtoi(String s) {
        // remove whitespaces...
        int sign = 1;
        int index = 0;
        s = s.trim();
        if (s.isEmpty()) return 0;

        // take care of sign..

        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        return helper(s, index, sign, 0);
    }
    public int helper(String s, int index, int sign, long num) {
        if (index >= s.length() || !Character.isDigit(s.charAt(index))) return (int) (sign * num );
        int digit = s.charAt(index) - '0';
        if (num > (Integer.MAX_VALUE - digit) / 10 ) return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        
        return helper(s, index+1, sign, num * 10 + digit);
    }
}
class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char let = s.charAt(i);
            if (i >= 0 && i < n - 1) {
                if (let == 'I' && ((s.charAt(i + 1) == 'V') || (s.charAt(i + 1) == 'X')))
                    num -= 1;

                else if (let == 'X' && ((s.charAt(i + 1) == 'L') || (s.charAt(i + 1) == 'C')))
                    num -= 10;

                else if (let == 'C' && ((s.charAt(i + 1) == 'D') || (s.charAt(i + 1) == 'M')))
                    num -= 100;

                else {
                    if (let == 'I')
                        num += 1;
                    if (let == 'V')
                        num += 5;
                    if (let == 'X')
                        num += 10;
                    if (let == 'L')
                        num += 50;
                    if (let == 'C')
                        num += 100;
                    if (let == 'D')
                        num += 500;
                    if (let == 'M')
                        num += 1000;
                }
            } else {
                if (let == 'I')
                    num += 1;
                if (let == 'V')
                    num += 5;
                if (let == 'X')
                    num += 10;
                if (let == 'L')
                    num += 50;
                if (let == 'C')
                    num += 100;
                if (let == 'D')
                    num += 500;
                if (let == 'M')
                    num += 1000;
            }

        }
        return num;
    }
}
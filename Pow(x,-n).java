class Solution {
    public double myPow(double x, int n) {
        double ans = 1.00;
        long nn = n;
        if (nn == -1) return (double) 1 / (double) x;
        if (nn < 0) nn = -1 * nn;
        if (nn == 1) return x;
        if (nn == 0) return 1;
        while (nn > 0) {
            if (nn % 2 == 1) {
                nn-=1;
                ans = ans * x;
            } else {
                x = x * x;
                nn = nn / 2;
            }
        }
        if (n < 0) return (double) 1 / (double) ans;
        return ans;
    }
}
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int ele: weights) {
            sum += ele;
            max = Math.max(ele, max);
        }

        if (days == 1) return sum;

        int l = max, r = sum, ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (numberOfDays(weights, mid) <= days) {
                ans = mid;
                r = mid-1;
            }
            else l = mid + 1;
        }
        // for ( int i = max; i <= sum; i++) {
        //     if (numberOfDays(weights, i) <= days) return i;
        // }
        return ans;
    }

    public int numberOfDays(int[] weights, int threshold) {
        int capacity = 0, nDays = 1;
        for (int ele : weights) {
            if (ele + capacity > threshold) {
                nDays++;
                capacity = ele;
            }
            else capacity += ele;
        }
        return nDays;
    }
}
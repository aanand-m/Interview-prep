class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int l = min(bloomDay), r = max(bloomDay), ans = -1;
        if ( m * k > bloomDay.length) return -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (possible(bloomDay, m, k, mid) == true) {
                ans = mid;
                r = mid - 1;
            } else
                l = mid + 1;
        }
        return ans;
    }

    public int min(int[] bloomDay) {
        int min = Integer.MAX_VALUE;
        for (int ele : bloomDay) {
            min = Math.min(ele, min);
        }
        return min;
    }

    public int max(int[] bloomDay) {
        int max = Integer.MIN_VALUE;
        for (int ele : bloomDay) {
            max = Math.max(ele, max);
        }
        return max;
    }

    public boolean possible(int[] bloomDay, int m, int k, int day) {
        int count = 0, ans = 0;
        for (int ele : bloomDay) {
            if (ele <= day)
                count++;
            else {
                ans += Math.floor(count / k);
                count = 0;
            }
        }
        ans += Math.floor(count / k);
        return ans >= m;
    }
}
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1, r = max(nums), ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (quotientSum(nums, mid) <= threshold) {
                ans = mid;
                r = mid -1;
            }
            else l = mid + 1;
        }
        return ans;
    }
    public int quotientSum (int[] nums, int divisor) {
        int ans = 0;
        for (int ele : nums) {
            ans += Math.ceil( (double) ele / (double) divisor);
        }
        return ans;
    } 

    public int max(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int ele : nums) {
            max = Math.max(ele, max);
        }
        return max;
    }
}
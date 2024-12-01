class Solution {
    public int maxSubArray(int[] nums) {
        int cs = 0;
        int ms = nums[0];
        for (int num : nums) {
            cs = Math.max(num, cs + num);
            ms = Math.max(cs, ms);
        }
        return ms;
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lB = lowerBound(nums, target);
        if (lB == nums.length || nums[lB] != target) return new int[] {-1, -1};
        else return new int[] {lB, upperBound(nums, target) - 1};
    }

    public int lowerBound(int[] nums, int target) {
        int l = 0; 
        int r = nums.length - 1; 
        int lB = nums.length;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] >= target) {
                lB = mid;
                r = mid - 1;
            }
            else l = mid + 1;
        }
        return lB;
    }

    public int upperBound(int[] nums, int target) {
        int l = 0; 
        int r = nums.length - 1; 
        int uB = nums.length;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] > target) {
                uB = mid;
                r = mid - 1;
            }
            else l = mid + 1;
        }
        return uB;
    }
}
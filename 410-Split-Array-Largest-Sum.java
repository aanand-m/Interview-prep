class Solution {
    public int splitArray(int[] nums, int k) {
        int max = Integer.MIN_VALUE, sum = 0;
        if (k > nums.length) return -1;
        for (int ele: nums) {
            max = Math.max(max, ele);
            sum += ele;
        }

        // for (int i = max; i <= sum; i++) {
        //     int student = students(nums, i);
        //     if (student == k) return i;
        // }

        int l = max, r = sum;
        while (l <= r) {
            int mid = (l + r ) / 2;
            int student = students(nums, mid);
            if (student > k) l = mid + 1;
            else r = mid -1;
        }
        return l;
    }

    public int students (int[] nums, int pages) {
        int students = 1, pageCount = 0;
        for (int ele : nums) {
            if (pageCount + ele <= pages) pageCount += ele;
            else {
                students++;
                pageCount = ele;
            }
        }
        return students;
    } 
}
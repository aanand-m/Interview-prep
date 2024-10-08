class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> mergedArray = new ArrayList<>();
        for (int ele : nums1) {
            mergedArray.add(ele);
        }
        for (int ele : nums2) {
            mergedArray.add(ele);
        }

        Collections.sort(mergedArray);
        int n = mergedArray.size();
        if (n % 2 == 1) return mergedArray.get(n/2);
        else  return (mergedArray.get(n/2) + mergedArray.get((n-1) / 2)) / 2.0;
    }
}
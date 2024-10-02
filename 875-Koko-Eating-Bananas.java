class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = maxElement(piles);
        while (l <= r) {
            int mid = (l + r) / 2;
            int time = totalTime(piles, mid);
            if (time <= h)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }

    public int maxElement(int[] piles) {
        int element = Integer.MIN_VALUE;
        for (int ele : piles) {
            element = Math.max(element, ele);
        }
        return element;
    }

    public int totalTime(int[] piles, int time) {
    int totalTime = 0;
    for (int ele: piles) {
    totalTime += Math.ceil((double) ele / (double) time);
    }
    return totalTime;
    }
}
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 1, r = (position[position.length -1] - position[0]), ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (isPossible(position, mid, m) == true) {
                ans = mid;
                l = mid + 1;
            }
            else r = mid - 1;
        }
        return ans;
    }
    public boolean isPossible (int[] position, int force, int m) {
        int ballCount = 1, lastBall = position[0];
        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastBall >= force) {
                ballCount++;
                lastBall = position[i];
            }
        }
        if (ballCount >= m) return true;
        else return false;
    }
}
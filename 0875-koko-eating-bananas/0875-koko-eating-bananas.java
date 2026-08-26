class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int end = 0;
        for (int i = 0; i < piles.length; i++) {
            end = Math.max(piles[i], end);
        }
        int start = 1;
        int ans = 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (estimatedTime(piles, mid) <= h) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return ans;
    }

    public static long estimatedTime(int[] arr, int speed) {
        long totalTime = 0;

        for (int i = 0; i < arr.length; i++) {
            totalTime += (arr[i] + (long) speed - 1) / speed;
        }

        return totalTime;
    }

}
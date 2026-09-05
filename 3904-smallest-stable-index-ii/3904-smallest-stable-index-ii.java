class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int maximum = Integer.MIN_VALUE;
        int[] suffixMin = new int[n];

        suffixMin[n - 1] = nums[n - 1];

        for (int j = n - 2; j >= 0; j--) {
            suffixMin[j] = Math.min(nums[j], suffixMin[j + 1]);
        }
        for (int i = 0; i < n; i++) {
            int minimum = Integer.MAX_VALUE;

            if (nums[i] > maximum) {
                maximum = nums[i];

            }
            minimum = suffixMin[i];

            int score = maximum - minimum;
            if (score <= k)
                return i;
        }
        return -1;
    }
}
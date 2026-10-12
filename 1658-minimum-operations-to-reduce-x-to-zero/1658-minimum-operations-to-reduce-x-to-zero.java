class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0;
        for (int i : nums) {
            total += i;
        }
        int ans = 0;
        if (total == x) {
            return nums.length;
        }
        int target = total - x;
        int maxLen = findLength(nums,target);
        if(maxLen !=-1){
            return nums.length - maxLen;
        }
        return -1;

    }

    public static int findLength(int[] arr, int target) {
        int maxLen = -1;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (left < arr.length && sum > target) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }
}
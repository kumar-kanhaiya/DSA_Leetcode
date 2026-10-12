class Solution {
    public int minOperations(int[] nums, int x) {
        // int total = 0;
        // for (int i : nums) {
        //     total += i;
        // }
        // int ans = 0;
        // if (total == x) {
        //     return nums.length;
        // }
        // int target = total - x;
        // int maxLen = findLength(nums,target);
        // if(maxLen !=-1){
        //     return nums.length - maxLen;
        // }
        // return -1;
        //optimise solution 
        int total = -x, left = 0, sum = 0, ans = Integer.MIN_VALUE;
        for(int a: nums) total+=a;
        if(x < 0) return -1;
        for(int right = 0 ; right < nums.length ; right++){
            sum += nums[right];
            while(sum> total && left <= right){
                sum -= nums[left++];
            }
            if(sum == total){
                ans = Math.max(ans , right - left +1);
            }
        }
        return ans == Integer.MIN_VALUE ? -1 : nums.length-ans;

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
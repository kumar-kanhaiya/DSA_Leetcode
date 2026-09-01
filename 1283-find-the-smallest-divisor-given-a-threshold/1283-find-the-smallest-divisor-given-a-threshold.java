class Solution {
    public int smallestDivisor(int[] arr, int threshold) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        int ans = start;
        for (int i = 0; i < arr.length; i++) {
            start = Math.min(start, arr[i]);
            end = Math.max(end, arr[i]);
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (helper(arr, mid) <= threshold) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;

    }

    public static int helper(int[] nums, int mid) {
        int sum = 0;
        for(int num : nums){
                sum += (num + mid - 1)/mid;
        }
        return (int) sum;
    }
}
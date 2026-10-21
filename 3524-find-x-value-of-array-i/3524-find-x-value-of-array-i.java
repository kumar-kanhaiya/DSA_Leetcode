class Solution {
    public long[] resultArray(int[] nums, int k) {
        int n = nums.length ;
        long[] result = new long[k];
        long[] prevCount = new long[k];
        for(int i = 0 ; i< n ; i++){
            long[] currentCount = new long[k];
            int currentRemainder = nums[i]%k;
            currentCount[currentRemainder]++;

            for(int oldRem = 0 ; oldRem <= k-1 ; oldRem++){
                 int newRemain = (int) (((long) oldRem * nums[i] % k) % k);

                currentCount[newRemain] += prevCount[oldRem];
            }
            prevCount = currentCount;
            for (int x = 0; x <= k - 1; x++) {
                result[x] += prevCount[x];
            }
        }
        return result;

    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int requiredSum = length * (length +1);
        requiredSum = requiredSum/2;
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }
        return requiredSum - sum;
    }
}
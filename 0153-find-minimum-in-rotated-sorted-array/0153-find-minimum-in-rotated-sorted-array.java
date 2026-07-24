class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        int ans = nums[0];
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid] < ans){
                ans = nums[mid];
            }
            if(nums[mid] >= nums[start]){
                start = mid+1;
                ans = Math.min(ans, nums[start]);
            }
            else{
                end = mid -1;
                ans = Math.min(ans,nums[end]);
            }
        }
        return ans;
    }
}
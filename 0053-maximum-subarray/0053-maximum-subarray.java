class Solution {
    public int maxSubArray(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int n: arr){
            sum += n;
            if(sum > ans){
                ans = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return ans;
    }
}
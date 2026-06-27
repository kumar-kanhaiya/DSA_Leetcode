class Solution {
    public int maxProfit(int[] nums) {
        int firstNumber = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int num : nums){
            if(num < firstNumber ){
                firstNumber = num;
            }
            
            maxProfit = Math.max(maxProfit , num - firstNumber);
        }
        return maxProfit;
    }
}
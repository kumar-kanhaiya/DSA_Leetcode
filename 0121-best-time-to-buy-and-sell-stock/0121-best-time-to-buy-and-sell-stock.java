class Solution {
    public static int maxProfit(int[] arr){
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int num : arr){
            if(min > num){
                min = num;
            }
            ans = Math.max(ans , num - min);
        }
        return ans;
    }
}
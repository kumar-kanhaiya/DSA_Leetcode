class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length ;
        int[] positive = new int[n/2];
        int firstIndex = 0;
        int secondIndex = 0;
        int[] negative = new int[n/2];
        for(int num : nums){
            if(num < 0){
                negative[secondIndex++] = num;
            }
            else{
                positive[firstIndex++] = num;
            }
        }
        int[] ans = new int[n];
        firstIndex = 0;
        secondIndex = 0;
        for(int i = 0 ; i < ans.length ; i++ ){
            if(i%2 == 0){
                ans[i] = positive[firstIndex++];
            }
            else{
                ans[i] = negative[secondIndex++];
            }
        }
        return ans;
        
    }
}
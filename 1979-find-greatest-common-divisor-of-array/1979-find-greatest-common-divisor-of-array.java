class Solution {
    public int findGCD(int[] nums) {
        // Arrays.sort(nums);
        // return gcd(nums[nums.length-1] , nums[0]);
        // second approach 
        int min = nums[0];
        int max = nums[0];
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return gcd(max , min);
        
    }

    public int gcd(int a , int b){
        while(b != 0 ){
            int rem = a % b;
            a=b;
            b =rem;
        }
        return a;

    }
}
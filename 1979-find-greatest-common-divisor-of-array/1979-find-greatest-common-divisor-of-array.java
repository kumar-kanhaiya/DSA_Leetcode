class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[nums.length-1] , nums[0]);
        
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
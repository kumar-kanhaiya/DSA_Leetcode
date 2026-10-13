class Solution {
    public  long maxAlternatingSum(int[] nums) {
        for(int i=0 ; i< nums.length ; i++){
            if(nums[i] < 0){
                nums[i] = -nums[i];
            }
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        
        int[] arr = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        int index = 0;
        while(start<= end && index < arr.length){
            arr[index++] = nums[end];
            if(index< arr.length){
            arr[index++] = nums[start];
                
            }
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
        long ans = 0;
        for(int i = 0 ; i< arr.length ; i++){
            if(i%2 == 0){
                ans += (int)Math.pow(arr[i],2);
            }
            else{
                ans -= (int)Math.pow(arr[i],2);
            }
        }
        return ans;
    }
}
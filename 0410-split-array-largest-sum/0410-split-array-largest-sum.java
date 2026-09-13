class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int num : nums){
            low = Math.max(low , num);
            high += num;
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            int partition = calculatePartition(nums , mid);

            if(partition > k){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return low;
        
    }
    public static int calculatePartition(int[] arr , int max){
        int partition = 1;
        int sum = 0;
        for(int num : arr){
            if(num + sum <= max){
                sum += num;
            }
            else{
                partition++;
                sum = num;
            }
        }
        return partition;
    }
}
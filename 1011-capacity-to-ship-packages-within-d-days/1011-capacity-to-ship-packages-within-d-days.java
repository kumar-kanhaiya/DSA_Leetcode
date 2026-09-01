class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int start = max(arr);
        int end = 0;
        for(int i = 0 ; i < arr.length ; i++){
            end += arr[i];
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            int noOfDays = helper(arr , mid);
            if(noOfDays <= days){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
        
    }
    public static int helper(int[] arr , int mid){
        int day =1;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(sum + arr[i] > mid){
                day++;
                sum = arr[i];
            }
            else{
                sum += arr[i];
            }
        }
        return day;
    }
    public static int max(int[] arr){
        int m = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            m = Math.max(arr[i] , m);
        }
        return m ;
    }
}
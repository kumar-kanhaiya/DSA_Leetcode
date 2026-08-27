class Solution {
    public int minDays(int[] arr, int m, int k) {
        int start = 0;
        int end = 0;
        for(int i = 0 ; i < arr.length ; i++){
            start = Math.min(start , arr[i]);
            end = Math.max(end , arr[i]);
        }
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(isMake(arr , mid , m , k)){
                // ans found 
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
        }
        return ans;
        
    }
    // checking the adjacent flowers 
    public static boolean isMake(int[] arr , int mid , int m , int k ){
        int bouquets = 0;
        int consecutive = 0;
        for(int flower : arr){
            if(flower <= mid){
                consecutive++;
            }
            else{
                consecutive = 0;
            }
            if(consecutive == k ){
                bouquets++;
                consecutive = 0;
            }
            
        }
        return bouquets >= m;
    }
}
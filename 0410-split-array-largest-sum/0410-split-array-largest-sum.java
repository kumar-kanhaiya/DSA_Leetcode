class Solution {
    public int splitArray(int[] arr, int k) {
        int start = 0;
        int end = 0;
        for(int i = 0 ; i< arr.length  ; i++){
            start = Math.max(start , arr[i]);
            end += arr[i];
        }
        // now implement the binary search 
        while(start < end){
            // try for the middle ans 
            int mid = start + (end - start )/2;

            // calculate how many peices divide this is with max sum
            int sum = 0;
            int peices = 1;
            for(int num : arr){
                if(sum + num > mid){
                    // you cannot add this in this subarray make new one 
                    // say you add this num in new array then sum = sum 
                    sum = num;
                    peices++;
                }
                else{
                    sum += num;
                }
            }
            if(peices > k){
                start = mid +1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
}
class Solution {
    public int firstStableIndex(int[] arr, int k) {
        if(arr.length == 1 ){
            return 0;
        }
        int i = 0;
        while(i< arr.length ){
            int check = helper(arr , i);
            if(check<=k){
                return i;
            }
            else{
                i++;
            }
        }
        return -1;
    }
    public static int helper(int[] arr , int k){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<= k ; i++){
            max = Math.max(arr[i], max);
        }
        for(int i = k ; i< arr.length ; i++){
            min = Math.min(min , arr[i]);
        }
        return max - min;
    }
}
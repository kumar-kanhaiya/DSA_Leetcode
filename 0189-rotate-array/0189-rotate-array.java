class Solution {
    public void rotate(int[] arr, int k) {
        k = k % arr.length ;
        int len = arr.length ;
        int pivot = len - k ;
        // swap left side 
        helper(arr , 0 , pivot -1 );
        // swap right side 
        helper(arr , pivot , len-1);
        // swap complete array 
        helper(arr , 0 , len-1);

    }
    public static void helper(int[] arr , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
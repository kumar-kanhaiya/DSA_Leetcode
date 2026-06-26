class Solution {
    public void sortColors(int[] arr) {
       //optimized approach 
       for(int i = 0 ; i < arr.length ; i++){
        int last = arr.length - i - 1;
        int max = max(arr , 0 , last);
        swap(arr , max, last);

       }
    }
    public static int max(int[] arr , int start , int end ){
        int max = 0;
        for(int i = start +1 ; i<= end ; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
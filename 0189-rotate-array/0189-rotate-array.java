class Solution {
    public void rotate(int[] arr, int k) {
        int[] ans = new int[arr.length ];
        int len = arr.length ;
        int index = 0;
        int pivotIndex = len - k % arr.length ;
        // now write the right side 
        for(int i = pivotIndex ; i< arr.length ; i++ ){
            ans[index++] = arr[i];
        }
        for(int i = 0 ; i< pivotIndex ; i++){
            ans[index++] = arr[i];
        }
        // now copy the ans into arr 
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = ans[i];
        }
    }
}
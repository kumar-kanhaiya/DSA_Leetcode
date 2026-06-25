class Solution {
    public int singleNumber(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        Arrays.sort(arr);
        for(int i = 0 ; i< arr.length ; i++){
            // starting case 
            if(i == 0 && i+1 < arr.length && arr[i] != arr[i+1]){
                return arr[0];
            }
            // element found in between 
            if((i+1 < arr.length && arr[i] != arr[i+1]) && (i>0 && arr[i] != arr[i-1]) ){
                return arr[i];
            }
            // ending case 
            if(i == arr.length -1 && arr[i] != arr[i-1]){
                return arr[i];
            }
        }
        return arr[0];

    }
}
class Solution {
    public boolean check(int[] arr) {
        int len = arr.length ;
        int check = 0;
        for(int i = 0 ; i < len ; i++){
            // there are generally two condition 
            // first one 
            if(i <len -1 && arr[i] > arr[i+1]){
                check++;
            }
            // second one which is the last index element 
            if(i == len-1 && arr[i] > arr[0]){
                check++;
            }
        }
        if(check > 1){
            return false;
        }
        return true;
    }
}
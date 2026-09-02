class Solution {
    public boolean uniformArray(int[] nums1) {
        return checkAllEven(nums1) || checkAllOdd(nums1);
        
    }
    public static boolean checkAllEven(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            boolean t = true;
            for(int j = i+1 ; j < arr.length ; j++){
                int check = arr[i] - arr[j];
                if(check%2 == 0 && arr[i]%2 == 0){
                    t= true;
                    break;
                }
            }
            if(!t){
                return false;
            }
        }
        return true;
    }
    public static boolean checkAllOdd(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            boolean t = false;
            for(int j = i+1 ; j < arr.length ; j++){
                int check = arr[i] - arr[j];
                if(check%2 != 0 && arr[i]%2 != 0){
                    t = true;
                    break;
                }
                
            }
            if(!t){
                return false;
            }
        }
        return true;
    }
}
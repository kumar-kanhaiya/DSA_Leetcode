class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        if(nums1.length == 1 ){
            return true;
        }
        if(nums1[0] %2 == 0){
            return checkAllEven(nums1);
        }
        return checkAllOdd(nums1);
        
    }
    public static boolean checkAllEven(int[] arr){
    
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%2 == 0){
                continue;
            } 
            boolean t = false;
            for(int j = 0 ; j < i ; j++){
                if(j == i){
                    continue;
                }
                int check = arr[i] - arr[j];
                if((check%2 == 0 && check >=1) || arr[i]%2 == 0){
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
            if(arr[i]%2 != 0){
                continue;
            }
            boolean t = false;
            for(int j = 0 ; j < i ; j++){
                if(i == j){
                    continue;
                }
                int check = arr[i] - arr[j];
                if((check%2!= 0 && check>=1 ) || arr[i]%2 !=0 ){
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
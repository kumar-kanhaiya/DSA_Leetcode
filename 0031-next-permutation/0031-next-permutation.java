class Solution {
    public void nextPermutation(int[] arr) {
        // findig the pivot 
        int pivot = -1;
        int n = arr.length ;
        for(int i = n -2 ; i>= 0 ; i--){
            // condition for finding the pivot 
            if(arr[i] < arr[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot != -1){
            // this is the condition of swap the smallest element with pivot 
            for(int i = n-1 ; i>pivot ; i--){
                if(arr[i] > arr[pivot]){
                    swap(arr , i , pivot);
                    break;
                }
            }
        }
        // now reverse the array 
        reverse(arr , pivot+1 , n-1);
    }

    public static void reverse(int[] arr , int start , int end){
        while(start < end){
            swap(arr , start , end);
            start++;
            end--;
        }
    }

    public static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
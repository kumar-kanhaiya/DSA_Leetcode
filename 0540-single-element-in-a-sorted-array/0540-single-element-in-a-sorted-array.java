class Solution {
    public int singleNonDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end - start)/2;
            // first case 
            if(mid>start && mid < end &&
            arr[mid] > arr[mid-1] && arr[mid]<arr[mid+1]){
                return arr[mid];
            }
            if(arr[start] == arr[start +1]){
                start += 2;
            }
            if(arr[end]== arr[end-1]){
                end -= 2;
            }
        }return arr[start];
        
    }
}
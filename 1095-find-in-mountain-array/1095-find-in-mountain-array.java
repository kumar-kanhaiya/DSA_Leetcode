/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int peakIndex = peakElement(arr);
        int firstHalf = helper(target , arr, 0 ,peakIndex );
        if(firstHalf != -1){
            return firstHalf;
        }
        return helper(target , arr , peakIndex +1 , arr.length() -1 );
        
    }

    public static int helper(int target , MountainArray arr , int start , int end ){
        boolean isAsc = arr.get(start) < arr.get(end);
        while(start <= end){
            int mid = start + (end -start)/2;
            if(arr.get(mid) == target){
                return mid;
            }
            if(isAsc){
                if (arr.get(mid) > target){
                    end = mid -1;
                }
                else{
                  start = mid +1;
                }
            }
            else{
                if(target > arr.get(mid)){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }

    public static int peakElement(MountainArray arr ){
        int start = 0;
        int end = arr.length() -1;
        while(start < end){
            int mid = start + (end - start)/2;
            // this is the 
            if(arr.get(mid) > arr.get(mid + 1)){
                end = mid;

            }
            else{
                start = mid +1;
            }
        }
        return start;
    }
}
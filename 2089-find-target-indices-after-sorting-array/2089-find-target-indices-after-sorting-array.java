class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        // now we have to implemeent the binary search 
        // int start = 0;
        // int end = arr.length - 1;
        // while (start <= end) {
        //     int mid = start + (end - start) / 2;
        //     if (arr[mid] < target) {
        //         start = mid + 1;
        //     }
        //     if (arr[mid] > target) {
        //         end = mid - 1;
        //     } else {
        //         // ans found ;
        //         ans.add(mid);
        //         if (mid > 0 && arr[mid] == arr[mid - 1]) {
        //             end = mid - 1;
        //         } else {
        //             start = mid + 1;
        //         }
        //     }
        // }
        // return ans;
        int startIndex = binarySearch(arr,target,true);
        int endIndex = binarySearch(arr, target , false);
        if(startIndex == -1 && endIndex == -1){
            return ans;
        }
        for(int i = startIndex ; i<= endIndex ; i++){
            ans.add(i);
        }
        return ans;
    }

    public static int binarySearch(int[] arr , int target , boolean check ){
        int start = 0;
        int end = arr.length;
        int ans = -1;
        while(start <end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid;
            }
            else if(arr[mid] < target){
                start = mid +1;
            }
            else{
                // ans found 
                ans = mid;
                if(check){
                    end = mid;
                }
                else{
                    start = mid +1;
                }
            }

        }
        return ans;
        }
}
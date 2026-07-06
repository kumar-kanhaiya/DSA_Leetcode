class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j< arr.length ; j++){
                int required = -(arr[i] + arr[j]);
                int k = binarySearch(arr , required , j+1 , arr.length -1);
                if(k != -1){
                     List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                    set.add(triplet);
                }
            }
        }
        ans.addAll(set);
        return ans;
        
    }
    public static int binarySearch(int[] arr , int target , int start , int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
class Solution {
    public int majorityElement(int[] arr) {
        int target = arr.length/2;
        int ans = 0;
        HashMap<Integer , Integer > map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i]) && map.get(arr[i]) > target ){
                ans = arr[i];
                break;
            }
            else{
                map.put(arr[i] , map.getOrDefault(arr[i], 1) + 1);
            }
        }
        return ans;
        
    }
}
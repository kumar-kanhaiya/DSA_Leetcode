class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap <Integer,Integer> map=new HashMap();
        for(int i = 0 ; i< arr.length ; i++){
            int req = target - arr[i];
            if(map.containsKey(req)){
                return new int[]{map.get(req) , i};
            }
            map.put(arr[i] , i);
        }
        return new int[]{-1,-1};
    }
}
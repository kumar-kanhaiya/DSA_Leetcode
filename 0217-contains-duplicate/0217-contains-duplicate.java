class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ;i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1 );
            int check = map.get(nums[i]);
            if(check >= 2){
                return true;
            }
        }
        return false;
    }
}
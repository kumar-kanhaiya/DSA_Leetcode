class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        // first loop 
        for(int i = 0 ; i< nums.length - 3 ; i++){
            // first check 
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            // second loop 
            for(int j = i+1 ; j< nums.length -2 ; j++){
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int sum = nums[i] + nums[j];
                int left = j+1;
                int right = nums.length-1;
                while(left < right){
                    long finalSum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if(finalSum > target){
                        right--;
                    }
                    else if(finalSum < target){
                        left++;
                    }
                    else{
                        // ans found 
                        List<Integer> check = Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                        left++;
                        right--;
                        // check for multiple cases
                        while(left < right && nums[left] == nums[left-1]){
                            left++;
                        }
                        while(left<right && nums[right] == nums[right+1]){
                            right--;
                        }
                        ans.add(check);
                    }
                }
            }
        }
        return ans;
    }
}
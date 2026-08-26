class Solution {
    public int largestInteger(int[] nums, int k) {
        int start = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int end = start + k - 1;
        while (end < nums.length) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = start; i <= end; i++) {
                set.add(nums[i]);
            }
            for (int x : set) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            start += 1;
            end = start + k - 1;
        }
        // now we have to find the almost 1
        int ans = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans = Math.max(ans, entry.getKey());
            }
        }
        return ans;
    }
}
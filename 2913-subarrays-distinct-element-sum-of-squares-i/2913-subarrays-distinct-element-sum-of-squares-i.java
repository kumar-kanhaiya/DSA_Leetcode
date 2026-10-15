class Solution {
    // public static int sumCounts(List<Integer> nums) {
    //     HashSet<List<Integer>> set = new HashSet<>();
    //     for (int i = 0; i < nums.size(); i++) {
    //         // set.add(Arrays.asList(nums.get(i)));
    //         ArrayList<Integer> check = new ArrayList<>();
    //         // check.add(nums.get(i));
    //         for (int j = i; j < nums.size(); j++) {
    //             check.add(nums.get(j));
    //             if(j>i){
    //                 set.add(new ArrayList<>(check));
    //             }
    //         }
    //         // set.add(check);
    //     }
    //     int ans = 0;
    //     for (List<Integer> list : set) {
    //         HashSet<Integer> distinct = new HashSet<>(list);
    //         ans += Math.pow(distinct.size(),2);
    //         // System.out.println("ans :- " + ans);
    //         // System.out.println(list + " -> " + distinct.size());
    //     }
    //     return ans+nums.size();

    // }
    public static int sumCounts(List<Integer> nums) {
    int ans = 0;

    for (int i = 0; i < nums.size(); i++) {
        HashSet<Integer> distinct = new HashSet<>();

        for (int j = i; j < nums.size(); j++) {
            distinct.add(nums.get(j));

            int count = distinct.size();
            ans += count * count;
        }
    }

    return ans;
}
}
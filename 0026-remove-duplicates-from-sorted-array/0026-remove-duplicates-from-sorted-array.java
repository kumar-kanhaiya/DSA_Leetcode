class Solution {
    public int removeDuplicates(int[] arr) {
        int[] ans = helper(arr);
        for(int i = 0 ; i < ans.length ; i++){
            arr[i] = ans[i];
        }
        // right side 
        for(int i = ans.length ; i < arr.length ; i++){
            arr[i] = 0;
        }
        return ans.length;
    }
    public static int[] helper(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i = 1 ; i< arr.length ; i++){
            if(arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0 ; i < ans.length ; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> ans = new ArrayList<>();
        int[] current = arr[0];
        for(int i = 1; i< arr.length ; i++){
            if(arr[i][0] <= current[1]){
                current[1] = Math.max(arr[i][1] , current[1]);
            }
            else{
                ans.add(current);
                current = arr[i];
                
            }
        }
        ans.add(current);
        return ans.toArray(new int[ans.size()][]);


    }
}
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        // int  m = grid.length;
        // int n = grid[0].length;
        // while(k > 0){
        //     for(int i = 0 ; i < grid.length ; i++){
        //         swap(grid[i] , 0 , n-1);
        //         swap(grid[i] , 1, n-1);
        //     }
        //     int temp = grid[m-1][0];
        //     grid[m-1][0] = grid[0][0];
        //     grid[0][0] = temp;
        //     k--;
        // }
        // List<List<Integer>> ans = new ArrayList<>();
        // for(int i = 0 ; i < m ; i++){
        //     List<Integer> check = new ArrayList<>();
        //     for(int j = 0 ; j <n ; j++){
        //         check.add(grid[i][j]);
        //     }
        //     ans.add(check);
        // }
        // return ans;

        int m = grid.length;
        int n = grid[0].length;
        k = k%(m*n);

        int[] arr = new int[m * n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i * n + j] = grid[i][j];
            }
        }
        // now swap the arr 
        swap(arr, 0, arr.length - 1);
        swap(arr, 0, k - 1);
        swap(arr, k, arr.length - 1);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> check = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                check.add(arr[i * n + j]);
            }
            ans.add(check);
        }
        return ans;

    }

    public static void swap(int[] arr, int l, int r) {
        // int l = 0;
        // int r = arr.length-1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
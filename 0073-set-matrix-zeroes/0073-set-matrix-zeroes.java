class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[][] arr = new boolean[matrix.length][matrix[0].length];
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j< matrix[0].length ; j++){
                if(matrix[i][j] != 0){
                    arr[i][j] = true;
                }
                else{
                    arr[i][j] = false;
                }
            }
        }
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j< matrix[0].length ; j++){
                if(matrix[i][j] == 0 && arr[i][j] == false){
                    helper(matrix , i , j);
                }
            }
        }

        
    }
    public static void helper(int[][] arr, int row, int col) {
    // Zero the entire row
    for (int i = 0; i < arr[0].length; i++) {
        arr[row][i] = 0;
    }

    // Zero the entire column
    for (int i = 0; i < arr.length; i++) {
        arr[i][col] = 0;
    }
}
}
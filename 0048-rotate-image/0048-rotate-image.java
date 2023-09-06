class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //Transpose of the matrix
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Reverse of the matrix
        for(int i = 0; i<n; i++){
            int low = 0;
            int high = n-1;
            while(low<=high){
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }
        
    }
}
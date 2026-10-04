class Solution {
    public boolean findRotation(int[][] matrix, int[][] target) {

        for(int rotation = 0; rotation < 4; rotation++) {

            if(isSame(matrix, target)) {
                return true;
            }

            rotate(matrix);
        }

        return false;
    }

    public int[][] rotate(int[][] matrix) {

        int n = matrix.length;

       
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        
        for(int row = 0; row < n; row++) {
            reverseRow(matrix[row]);
        }

        return matrix;
    }

    public void reverseRow(int[] row) {

        int left = 0;
        int right = row.length - 1;

        while(left < right) {

            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;

            left++;
            right--;
        }
    }

    public boolean isSame(int[][] matrix, int[][] target) {

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {

                if(matrix[i][j] != target[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
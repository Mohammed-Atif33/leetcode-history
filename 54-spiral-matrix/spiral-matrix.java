class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        List<Integer> order = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(top <= bottom && left <= right){

            for(int col1 = left; col1 <= right; col1++){
                order.add(matrix[top][col1]);
            }
            top++;

            for(int row1 = top; row1 <= bottom; row1++){
                order.add(matrix[row1][right]);
            }
            right--;

            if(top <= bottom){
                for(int col2 = right; col2 >= left; col2--){
                    order.add(matrix[bottom][col2]);
                }
                bottom--;
            }

            if(left <= right){
                for(int row2 = bottom; row2 >= top; row2--){
                    order.add(matrix[row2][left]);
                }
                left++;
            }
        }
        return order;
    }
}
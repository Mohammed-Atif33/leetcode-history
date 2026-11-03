class Solution {

    public int findMaxNoIndex(int[][] matrix, int n,int col){
        int maxNo = -1;
        int index = -1;

        for(int i = 0; i < n;i++){
            if(matrix[i][col] > maxNo){
                maxNo = matrix[i][col];
                index = i;
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = m - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            int maxRowIndex = findMaxNoIndex(mat,n,mid);
            int left = mid - 1 >= 0 ? mat[maxRowIndex][mid-1] : -1;
            int right = mid + 1 < m ? mat[maxRowIndex][mid+1]  : -1;

            if(mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right) {
                return new int[]{maxRowIndex , mid};
            }
            else if(mat[maxRowIndex][mid] < left){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
}
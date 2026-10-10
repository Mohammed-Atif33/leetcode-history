class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int pos = n - 1;

        int[] arr = new int[n];

        // for squaring the number
        for(int k = 0; k < n; k++){
            nums[k] = nums[k] * nums[k];
        }

        // for sorting 
        while(i <= j){
            if(nums[i] > nums[j]){
                arr[pos] = nums[i];
                i++;
                pos--;
            }
            else{
                arr[pos] = nums[j];
                pos--;
                j--;
            }
        }

        return arr;

    }
}
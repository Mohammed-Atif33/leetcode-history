class Solution {
    public int maxSubArray(int[] nums) {
        int maxNo = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        // int asStart = -1;
        // int asEnd = -1;

        for(int i = 0; i < nums.length; i++){

            if(sum == 0){
                start = i;
            }

            sum += nums[i];

            if(sum > maxNo){
                maxNo = sum;
                // asStart = start;
                // asEnd = i;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        return maxNo;

    }
}
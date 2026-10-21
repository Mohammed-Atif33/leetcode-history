class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int answer = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + ((high - low) / 2);

            if(nums[low] <= nums[mid]){
                answer = Math.min(answer,nums[low]);
                low = mid + 1;
            }
            else{
                high = mid - 1;
                answer = Math.min(answer,nums[mid]);
            }
        }
        return answer;
    }
}
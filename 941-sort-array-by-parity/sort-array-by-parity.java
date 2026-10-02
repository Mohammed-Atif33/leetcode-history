class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            

            // Move left while it already has an even number
            while(left < right && nums[left] % 2 == 0) {
                left++;
            }

            // Move right while it already has an odd number
            while(left < right && nums[right] % 2 != 0) {
                right--;
            }

            // Now left = odd and right = even
            if(left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }

        return nums;
    }
}
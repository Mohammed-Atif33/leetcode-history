class Solution {
    public int minDeletion(int[] nums) {

        int n = nums.length;

        if(nums.length == 1){
            return 1;
        }

        int count = 0;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i+1]){
                count++;
            }
            else{
                i++;
            }
        }

        count += (n - count) % 2;

        return count;
    }
}
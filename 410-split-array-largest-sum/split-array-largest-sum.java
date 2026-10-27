class Solution {
    private int largestFind(int[] nums , int large){
        
        int split = 1;
        int largestsum = 0;

        for(int i = 0; i < nums.length; i++){
            if(largestsum + nums[i] <= large){
                largestsum += nums[i];
            }
            else{
                split++;
                largestsum = nums[i];
            }
        }
        return split;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;

        if(k > n){
            return -1;
        }

        int low = 0;
        int high = 0;

        for(int num : nums){
            low = Math.max(low, num);
            high += num;
        }

        while(low <=high){
            int mid = low + (high - low) / 2;

            if(largestFind(nums,mid) > k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
}
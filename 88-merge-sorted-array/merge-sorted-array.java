class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] nums = new int[m + n];
 

        while(i < m && j < n){

            if(nums1[i] >= nums2[j]){
                nums[k] = nums2[j];
                k++;
                j++;
            }
            else{ 
                nums[k] = nums1[i];
                k++;
                i++;
            }
        }

        while(i < m){
            nums[k] = nums1[i];
            i++;
            k++;
        }

        while(j < n){
            nums[k] = nums2[j];
            j++;
            k++;
        }

        for(int start = 0; start < nums.length; start++){
            nums1[start] = nums[start];
        }
    }
}
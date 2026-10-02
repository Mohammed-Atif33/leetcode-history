class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int el = 0;
        int arrSize = nums.length;

        for(int i = 0; i < arrSize; i++){
            if(count == 0){
                count = 1;
                el = nums[i]; 
            }
            else if(nums[i] == el){
                count++;
            }
            else{
                count--;
            }
        }

        int count1 = 0 ;
        for(int i = 0; i < arrSize; i++){
            if(nums[i] == el){
                count1++;
            }
        }

        if(count1 > (arrSize/2)){
            return el;
        }

        return -1;
    }
}
import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        
        int el1 = Integer.MIN_VALUE;  
        int count1 = 0;

        int el2 = Integer.MIN_VALUE;  
        int count2 = 0;

        for(int i = 0; i < n; i++){
            if(count1 == 0 && nums[i] != el2){
                count1 = 1;
                el1 = nums[i];
            }
            else if(count2 == 0 && nums[i] != el1){
                count2 = 1;
                el2 = nums[i];
            }
            else if(nums[i] == el1){
                count1++;
            }
            else if(nums[i] == el2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        List<Integer> answer = new ArrayList<>();
        count1 = 0;
        count2 = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == el1){
                count1++;
            }

            if(nums[i] == el2){
                count2++;
            }
        }

        int mini = (int)(n/3) + 1;

        if(count1 >= mini){
            answer.add(el1);
        }

        if(el1 != el2 && count2 >= mini){
            answer.add(el2);
        }

        Collections.sort(answer);

        return answer;
    }
}
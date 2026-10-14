class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;
        if(n == 0){
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numSet.add(nums[i]);
        }

        int longest = 1;

        for (int c : numSet) {

            if(numSet.contains(c - 1)){
                continue;
            }

            int currentlength = 1;
            int nextValue = c+1;

            while (numSet.contains(nextValue)){
                currentlength+=1;
                nextValue+=1;
            }

            longest = Math.max(longest,currentlength);
        }

        return longest;

    }
}
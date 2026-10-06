class Solution {
    public int[] twoSum(int[] number, int target) {
        int n = number.length;

        int i = 0;
        int j = n - 1;

        while(i < j) {

            if(number[i] + number[j] == target) {
                return new int[]{i + 1, j + 1};
            }
            else if(number[i] + number[j] < target) {
                i++;
            }
            else {
                j--;
            }
        }

        return new int[]{};
    }
}
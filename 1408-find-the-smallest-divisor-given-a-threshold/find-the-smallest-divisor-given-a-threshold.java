class Solution {
    public int canDivide(int[] nums, int divisor) {
        int total = 0;

        for (int num : nums) {
            total += (num + divisor - 1) / divisor;
        }

        return total;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;

        for (int num : nums) {
            high = Math.max(high, num);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canDivide(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
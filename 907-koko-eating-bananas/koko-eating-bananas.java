class Solution {
    public long canDivide(int[] nums, int divisor) {
        long total = 0;

        for (int num : nums) {
            total += (num - 1L + divisor) / divisor;
        }

        return total;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int num : piles) {
            high = Math.max(high, num);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canDivide(piles, mid) <= h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
class Solution {
    public int mySqrt(int x) {
        long low = 1;
        long high = x;

        while(low <= high){
            long mid = low + (high - low) / 2;
            long value = mid * mid;

            if(value <= x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return (int) high;
    }
}
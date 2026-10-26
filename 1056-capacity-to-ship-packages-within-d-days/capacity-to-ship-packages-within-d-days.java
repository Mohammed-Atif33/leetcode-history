class Solution {
    private int dayReq(int[] weights , int dayTake){
        int days = 1;
        int load = 0;

        for(int weight : weights){
            if(load + weight > dayTake){
                days = days + 1;
                load = weight;
            }
            else{
                load += weight;
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int weight : weights){
            max = Math.max(max,weight);
            sum+=weight;
        }

        int low = max;
        int high = sum;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(dayReq(weights,mid) <= days){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
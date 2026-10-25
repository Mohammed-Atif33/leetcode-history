class Solution {
    private boolean possibleDay(int[] arr, int day,int m,int k){
        int count = 0;
        int noOfM = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= day){
                count++;
            }
            else{
                noOfM += (count / k);
                count = 0;
            }
        }
        noOfM += (count / k);
        return noOfM >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {

        if((long) m * k > bloomDay.length){
            return -1;
        }

        int low = bloomDay[0];
        int high = bloomDay[0];

        for (int bloom : bloomDay) {
            low = Math.min(low, bloom);
            high = Math.max(high, bloom);
        }

        while(low < high){
            int mid = low + (high - low) / 2;
            
            if(possibleDay(bloomDay,mid,m,k)){
                high = mid;
            }
            else{
                low = mid + 1; 
            }
        }
        return low;
    }
}
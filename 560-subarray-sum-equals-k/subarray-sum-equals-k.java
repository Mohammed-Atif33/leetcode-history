import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Long,Long> mpp = new HashMap<>();

        mpp.put(0L , 1L);

        long prefix = 0;
        long count = 0;

        for(int value : nums){
            prefix += value;

            long remove = prefix - k;

            if(mpp.containsKey(remove)){
                count += mpp.get(remove);
            }

            mpp.put(prefix,mpp.getOrDefault(prefix , 0L) + 1);

        }

        return (int) count;
    }
}
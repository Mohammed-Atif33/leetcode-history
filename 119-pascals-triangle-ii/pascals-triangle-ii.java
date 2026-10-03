import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> result = new ArrayList<>();

        long ans = 1;

        for(int i = 0; i <= rowIndex; i++) {

            result.add((int) ans);

            ans = ans * (rowIndex - i) / (i + 1);
        }

        return result;
    }
}
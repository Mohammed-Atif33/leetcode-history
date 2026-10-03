import java.util.*;

class Solution {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> result = new ArrayList<>();

        long ans = 1;

        result.add((int) ans); 

        for(int i = 1; i <= rowIndex; i++) {

            ans = ans * (rowIndex - i + 1) / i;

            result.add((int) ans);     
        }

        return result;

    }

    public List<List<Integer>> generate(int numRows) {

       List<List<Integer>> answer = new ArrayList<>();

       for(int i = 0; i < numRows; i++){
            answer.add(getRow(i));
       } 

       return answer;
    }
}
    
class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int cnt = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                cnt++;
                if(cnt > max){
                    max = cnt;
                }
            }
            else if(ch == ')'){
                cnt--;
            }
        }
        return max;
    }
}
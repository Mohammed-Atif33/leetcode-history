class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mpp = new HashMap<>();

        for(char c : s.toCharArray()){
            mpp.put(c,mpp.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character> queue = new PriorityQueue<>((a,b) -> mpp.get(b) - mpp.get(a));
        queue.addAll(mpp.keySet());

        StringBuilder sb = new StringBuilder();

        while(!queue.isEmpty()){
            char c = queue.poll();

            int freq = mpp.get(c);

            for(int i = 0; i < freq; i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
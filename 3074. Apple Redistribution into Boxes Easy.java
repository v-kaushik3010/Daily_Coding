class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int apples = 0;
        for(int i : apple) apples += i;
        Arrays.sort(capacity);
        int reqbox =0;
        int count =0;
        for(int i = capacity.length -1; i >= 0; i--){
            count++;
            reqbox+=capacity[i];
            if(reqbox >=apples) return count;
        }return -1;
        
    }
}

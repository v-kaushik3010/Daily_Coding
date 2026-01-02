class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        int i =0;
        long sum =0;
        while(k-- >0){
            long val =happiness[n-1-i] -i; 
            if( val>0 ){
                sum+=val;
                i++;
            }
        }return sum;
        
    }
}

// Last updated: 9/22/2026, 2:50:54 PM
class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = lowLimit; i <=highLimit; i++){
            int num = i;
            int sum =0;
            while(num > 0){
                int rem = num %10; 
                sum+=rem;
                num/=10;
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }int max = 0;
        for(int e : map.keySet()){
            max = Math.max(max, map.get(e));
        }return max;
    }
}
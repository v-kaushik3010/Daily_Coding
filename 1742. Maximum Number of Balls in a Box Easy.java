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
        for(int e : map.values()){       //for(int e : map.keySet()){
            max = Math.max(max, (e));   //max = Math.max(max, map.get(e));}
        }return max;

      //or ans = Collections.max(map.values());
    }
}


//Using array
class Solution {
    public int countBalls(int low, int high) {
        int[] box = new int[46];
        int ans = 0;

        for (int i = low; i <= high; i++) {
            int s = 0, x = i;
            while (x > 0) {
                s += x % 10;
                x /= 10;
            }
            box[s]++;
            ans = Math.max(ans, box[s]);
        }
        return ans;
    }
}

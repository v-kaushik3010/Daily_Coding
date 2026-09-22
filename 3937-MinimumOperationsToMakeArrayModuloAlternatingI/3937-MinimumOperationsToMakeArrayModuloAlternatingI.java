// Last updated: 9/22/2026, 2:41:57 PM
class Solution {
    public int minOperations(int[] nums, int k) {
         int size = nums.length;

        int[] e = new int[k];
        int[] o = new int[k];

        for(int i = 0; i < size; i++){

            int rem = nums[i] % k;

            for(int j = 0; j < k; j++){

                int diff = Math.abs(rem - j);

                int cost = Math.min(diff, k - diff);

                if(i % 2 == 0){
                    e[j] += cost;
                }else{
                    o[j] += cost;
                }
            }
        }

        int min = Integer.MAX_VALUE;

        for(int x = 0; x < k; x++){

            for(int y = 0; y < k; y++){

                if(x == y) continue;

                min = Math.min(min, e[x] + o[y]);
            }
        }

        return min;
    }
}
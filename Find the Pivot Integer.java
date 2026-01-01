class Solution {
    public int pivotInteger(int n) {
      int totalsum = n*(n+1)/2;
      int root = (int)Math.sqrt(totalsum);
      return (root*root)==totalsum ?  root:-1;
    }
}

//or

class Solution {
    public int pivotInteger(int n) {
        int totalsum = (n)*(n+1)/2;
        int leftsum =0;
        for(int i = 1; i <= n; i++){
             leftsum +=i;

            if(leftsum == totalsum- leftsum+i)return i;
        }return -1;
    }
}

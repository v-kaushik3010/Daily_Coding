// Last updated: 9/22/2026, 2:47:24 PM
class Solution {
    public int pivotInteger(int n) {
      int totalsum = n*(n+1)/2;
      int root = (int)Math.sqrt(totalsum);
      return (root*root)==totalsum ?  root:-1;
    }
}
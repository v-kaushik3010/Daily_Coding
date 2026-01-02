class Solution {
    public int countOdds(int low, int high) {
        int diff = high -low;
        if(high%2 == 0 && low%2 ==0) return diff/2;
        else if(high%2 != 0 && low%2 !=0) return (diff/2)+1;
        else return (diff+1)/2;
    }
}

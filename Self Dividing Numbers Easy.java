class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(check(i)) ll.add(i);
        }return ll;


    }
    public static boolean check(int num){
        int nnum = num;
        while(nnum>0){
            int digit = nnum%10;
            if(digit==0 || num % digit!= 0) return false;
            nnum/=10; 
        }return true;
    } 
}

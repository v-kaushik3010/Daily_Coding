// Last updated: 9/22/2026, 3:01:33 PM
class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> ll = new LinkedList<>();

        int n= digits.length;
        int carry = 1;
      

        for(int i = n-1; i >=0; i--){
           int sum = digits[i] + carry;
            carry = sum/10;
            sum = sum %10;
            ll.addFirst(sum);

        }if(carry > 0) ll.addFirst(carry);
        int m = ll.size();
        int[] res = new int[ll.size()];
        for(int i =0; i <m; i++){
            res[i]= ll.removeFirst();
        }return res;
    }
}

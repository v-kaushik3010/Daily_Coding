// Last updated: 9/22/2026, 2:55:29 PM
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Deque<Integer> st = new ArrayDeque<>();
         Arrays.fill(left, -1);
         Arrays.fill(right, n);
        
        //left: PLE(previous less element)
        for(int i = 0; i < n; ++i){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(!st.isEmpty()) left[i] = st.peek();
            st.push(i);
        }
        st.clear();

        //right : NLE: Next less element
        for(int i =n-1; i >=0; --i){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(!st.isEmpty()) right[i] = st.peek();
            st.push(i);
        }
       
       //final answer
       int mod = (int) 1e9+7;
       long answer = 0;
       for(int i =0; i < n; i++){
        answer+=(long)(i-left[i])*(right[i]-i)*arr[i];
        answer%= mod;
       }return (int)answer;


    }
}
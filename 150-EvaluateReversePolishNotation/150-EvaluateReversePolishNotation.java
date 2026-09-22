// Last updated: 9/22/2026, 2:59:51 PM
class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack =  new Stack<>();

        for(String c: tokens){
            if(c.equals("+")){
                stack.push(stack.pop()+ stack.pop());
            }
            else if(c.equals("-")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first - second);
            }
            else if(c.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if(c.equals("/")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first/second);
            }
            else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.peek();
    }
}
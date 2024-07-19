class Solution {
    public int evalRPN(String[] tokens) {
        int a,b,c;
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens){
            if((!token.equals("+")) && (!token.equals("-")) && (!token.equals("/")) && (!token.equals("*"))){
                stack.add(Integer.parseInt(token));
            }else{
                a = stack.peek();
                stack.pop();
                b = stack.peek();
                stack.pop();
                if(token.equals("+")){
                    c = b+a;
                } else if (token.equals("-") ) {
                    c = b-a;
                } else if (token.equals("*") ) {
                    c = b*a;
                } else {
                    c = b/a;
                }
                stack.add(c);
            }
        }
        return stack.peek();
    }
}
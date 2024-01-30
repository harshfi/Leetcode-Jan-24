class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        Set<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        for (String token : tokens){
            if (!operators.contains(token)){
                stack.push(Integer.parseInt(token));
                continue;
            }
            if (stack.size() <2){
                // invalid case
                return 0;
            }
            Integer op2 = stack.pop();
            Integer op1 = stack.pop();
            stack.push(operate(op1, op2, token));
        }
        return stack.pop();
    }
    public int operate(int op1, int op2, String op){
        switch (op) {
        
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                return op1 / op2;
            default :
                return op1 + op2;

        }
    }
}
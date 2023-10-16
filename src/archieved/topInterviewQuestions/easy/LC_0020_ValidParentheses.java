package archieved.topInterviewQuestions.easy;

import java.util.Stack;

public class LC_0020_ValidParentheses {

    /**
     * Question : https://leetcode.com/problems/valid-parentheses/
     * Notes :
     *      - Stack is synchronized class, it will take more time
     *      - Either use plan stack or use non-synchronized Deque etc
     */
    public static void main(String[] args) {
        String s = "{}";
        System.out.println(new LC_0020_ValidParentheses().isValid(s));
    }

    public boolean isValid_v1(String s) {
        if(s.length() == 1)
            return false;

        Stack<String> stack = new Stack<>();
        int i = 0;
        while (i < s.length()){
            char c = s.charAt(i++);
            if(c == '{' || c == '(' || c == '['){
                stack.push(c+"");
            }
            else {
                if(stack.isEmpty())
                    return false;

                if(c == '}' && stack.peek().charAt(0) == '{'){
                    stack.pop();
                    continue;
                }
                else if (c == ']' && stack.peek().charAt(0) == '['){
                    stack.pop();
                    continue;
                }
                else if (c == ')' && stack.peek().charAt(0) == '('){
                    stack.pop();
                    continue;
                }

                break;
            }
        }

        return stack.empty();
    }

    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int stackTop = -1;
        char c;

        for(int i =0; i<s.length(); i++){
            c = s.charAt(i);
            if(c == '(' || c=='[' || c=='{'){
                stack[++stackTop] = c;
            }else{
                if(c==')'){
                    if(stackTop != -1 && stack[stackTop] == '('){
                        stackTop--;
                    }else{
                        return false;
                    }
                }else if(c==']'){
                    if(stackTop != -1 && stack[stackTop] == '['){
                        stackTop--;
                    }else{
                        return false;
                    }
                }else if(c=='}'){
                    if(stackTop != -1 && stack[stackTop] == '{'){
                        stackTop--;
                    }else{
                        return false;
                    }
                }
            }
        }
        if(stackTop == -1)
            return true;
        else
            return false;
    }
}

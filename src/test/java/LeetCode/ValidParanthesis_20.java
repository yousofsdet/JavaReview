package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidParanthesis_20 {

    public static void main(String[] args) {
        Deque<Character> stack = new ArrayDeque<Character>();
        stack.push('a');
        stack.push('B');
        stack.push('A');
        System.out.println( stack.toString() );
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(isValid("([{}])"));

    }
    public static boolean isValid(String chr){

        Stack<Character> stack = new Stack();

        for (char c : chr.toCharArray()) {
            if (c == '(' || c =='{' || c =='['){
                stack.push(c);
            }else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }else if(c=='}'&& !stack.isEmpty() && c=='{'){
                stack.pop();
            }else if (c==']'&& !stack.isEmpty() && c=='['){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}

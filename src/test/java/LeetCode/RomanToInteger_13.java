package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Hashtable;

public class RomanToInteger_13 {

    public static void main(String[] args) {

            Deque<Character> stack = new ArrayDeque<Character>();
            stack.push('A');
            stack.push('B');
            stack.push('A');
        System.out.println( stack.toString() );

        System.out.println(stack.peek());
            System.out.println(stack.pop());

//        System.out.println(romanNum("V"));
        }
    }

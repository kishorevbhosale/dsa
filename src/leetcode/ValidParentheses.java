package leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        String inStr = "({[";
        String outStr = ")}]";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isCharPresent(inStr,c)){
                stack.push(c);
            }
            else {
                if (!stack.isEmpty() && isCharPresent(outStr, c)){
                    if (inStr.indexOf(stack.peek())==outStr.indexOf(c)){
                        stack.pop();
                    }else {
                        return false;
                    }
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static boolean isCharPresent(String s, char c){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==c)
                return true;
        }
        return false;
    }
}

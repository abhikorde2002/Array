package String;

import java.util.Stack;

public class Parenthesis {
    // paerenthesis matching using stack data structure
    public static void main(String[] args) {
        String str = "dhtdyrg[][[]]";
        System.out.println(isParenthisisMatch(str) ? "Parenthesis are match" : "Parenthesis are not match");
    }

    static boolean isParenthisisMatch(String str) {
        if (str.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((ch == ')' && top == '(')
                        || (ch == ']' && top == '[')
                        || (ch == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

package lesson4.HomeWork;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String string = "()";
        System.out.println(isValid(string));
    }

    private static boolean isValid(String s) {
        int length = s.length();
        if (length % 2 != 0) {
            return false;
        }
        Stack<Character> check = new Stack<>();
        for (int i = 0; i < length; i++) {
            char temp = s.charAt(i);
            if (temp == '(' || temp == '[' || temp == '{') {
                check.push(temp);
            } else if (temp == ')') {
                if (i == 0 || check.empty() || check.peek() != '(') {
                    return false;
                } else {
                    check.pop();
                }
            } else if (temp == '}') {
                if (i == 0 || check.empty() || check.peek() != '{') {
                    return false;
                } else {
                    check.pop();
                }
            } else if (temp == ']') {
                if (i == 0 || check.empty() || check.peek() != '[') {
                    return false;
                } else {
                    check.pop();
                }
            }
        }
        return check.size() == 0;
    }
}

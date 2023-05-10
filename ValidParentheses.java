import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ValidParentheses {

    /* 1ms method */
    // public boolean isValid(String s) {
    // boolean flag = false;

    // char InputString[] = new char[s.length()];

    // for (int a = 0; a < s.length(); a++) {
    // InputString[a] = s.charAt(a);
    // }

    // char[] StringArray = new char[InputString.length];
    // int p = 0;

    // for (char temp : InputString) {
    // if (temp == '{' || temp == '[' || temp == '(') {
    // StringArray[p++] = temp;
    // continue;
    // } else if (p != 0 && ((temp == '}' && StringArray[p - 1] == '{')
    // || (temp == ']' && StringArray[p - 1] == '[')
    // || (temp == ')' && StringArray[p - 1] == '('))) {
    // // if (StringArray[p - 1] == '{' || StringArray[p - 1] == '[' ||
    // StringArray[p -
    // // 1] == '(') {
    // p--;
    // flag = true;
    // } else {
    // flag = false;
    // break;
    // }
    // }
    // if (p != 0)
    // flag = false;
    // return flag;

    // }

    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        for (char c : s.toCharArray()) {
            if (c == '(')
                stack[++top] = (')');
            else if (c == '{')
                stack[++top] = ('}');
            else if (c == '[')
                stack[++top] = (']');
            else if (top == -1 || c != stack[top])
                return false;
            else
                top--;
        }

        return top == -1;
    }

    public static void main(String[] args) {

        String s = "({[]})";
        ValidParentheses object = new ValidParentheses();

        boolean sol = object.isValid(s);

        System.out.println(sol);
    }
}
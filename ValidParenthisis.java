import java.util.Stack;

public class ValidParenthisis {

    public static Boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {

                    return true;
                } else {
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }
        return false;

    }

    public static Boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening 
            if (ch == '(' || ch == '{' || ch == '[') {

                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }

                if ((ch == ')' && s.peek() == '(') || (ch == '}' && s.peek() == '{')
                        || (ch == ']' && s.peek() == '[')) {
                    s.pop();
                } else {
                    return false;
                }
            }

        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "((({})[]))";

        // System.out.println(isValid(str));
        System.out.println(isDuplicate(str));

    }
}

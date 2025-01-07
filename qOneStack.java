import java.util.Stack;

public class qOneStack {

   public static void pushBottom(Stack<Character> s, char data) {

      if (s.isEmpty()) {
         s.push(data);
         return;

      }

      char a = s.pop();
      pushBottom(s, data);
      s.push(a);

   }

   // public static void removeStack(){

   // }

   public static void ReverseStack(Stack<Character> s) {
      if (s.isEmpty()) {
         return;
      }

      char element = s.pop();
      ReverseStack(s);
      pushBottom(s, element);

   }

   public static void prints(Stack<Character> s) {
      while (!s.isEmpty()) {
         System.out.println(s.pop());
      }

   }

   // public static String string(String str) {
   // Stack<Character> s = new Stack<>();
   // int id = 0;
   // while (id < str.length()) {
   // s.push(str.charAt(id));
   // id++;

   // }

   // StringBuilder result = new StringBuilder("");
   // while (!s.isEmpty()) {
   // char curr = s.pop();
   // result.append(curr);

   // }
   // return result.toString();
   // }

   public static void main(String[] args) {
      Stack<Character> s = new Stack<>();

      s.push('a');
      s.push('b');
      s.push('c');

      prints(s);
      prints(s);

      ReverseStack(s);

      prints(s);
      // reverseTheString(s);
      // String str = "Chiku";

      // String result = string(str);
      // System.out.println(result);

   }
}

import java.util.*;

public class Suubstring {
    public static void main(String[] args) {
        // substrings("abc", "");
        System.out.println(substrings2("abc", ""));
        System.out.println(substringsascii("abc", ""));
    }

    static void substrings(String str1, String sb) {
        if (str1.isEmpty()) {
            System.out.println(sb);
            return;
        }
        char ch = str1.charAt(0);

        substrings(str1.substring(1), sb + ch);
        substrings(str1.substring(1), sb);
    }

    static ArrayList<String> substrings2(String str1, String sb) {
        if (str1.isEmpty()) {
            ArrayList<String> al = new ArrayList<>();
            al.add(sb);
            return al;
        }
        char ch = str1.charAt(0);

        ArrayList<String> a1 = substrings2(str1.substring(1), sb + ch);
        ArrayList<String> a2 = substrings2(str1.substring(1), sb);

        a1.addAll(a2);
        return a1;
    }

    static ArrayList<String> substringsascii(String str1, String sb) {
        if (str1.isEmpty()) {
            ArrayList<String> al = new ArrayList<>();
            al.add(sb);
            return al;
        }
        char ch = str1.charAt(0);

        ArrayList<String> a1 = substringsascii(str1.substring(1), sb + ch);
        ArrayList<String> a2 = substringsascii(str1.substring(1), sb);
        ArrayList<String> a3 = substringsascii(str1.substring(1), sb + (ch + 0));
        a1.addAll(a2);
        a1.addAll(a3);
        return a1;
    }
}

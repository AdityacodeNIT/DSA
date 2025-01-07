import java.util.*;

public class LetterCombination {

    static String[] mapping = {
            "", // 0
            "", // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs", // 7
            "tuv", // 8
            "wxyz" // 9
    };

    public static void main(String[] args) {
        String digits = "23";

        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {

        String Unprocessed = "";

        ArrayList<String> al = new ArrayList<>();
        if (digits.isEmpty()) {
            return al; // Return empty list for empty input
        }
        helper(digits, Unprocessed, al);
        return al;
    }

    static void helper(String digits, String unprocessed, ArrayList<String> al) {
        if (digits.isEmpty()) {
            al.add(unprocessed);
            return;
        }
        char ch = digits.charAt(0);
        int digit = ch - '0';
        String letters = mapping[digit];

        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
)))          }

    }
}
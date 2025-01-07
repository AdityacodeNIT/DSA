import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {

        // permutation("abc", "");
        System.out.println(permutationArray("abc", ""));
        System.out.println(permutationNumber("abcd", ""));

    }

    static void permutation(String str, String processed) {
        if (str.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = str.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());

            permutation(str.substring(1), f + ch + s);
        }
    }

    static ArrayList<String> permutationArray(String str, String processed) {
        if (str.isEmpty()) {
            ArrayList<String> al = new ArrayList<>();
            al.add(processed);
            return al;
        }
        char ch = str.charAt(0);

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());

            ans.addAll(permutationArray(str.substring(1), f + ch + s));
        }
        return ans;
    }

    static int permutationNumber(String str, String processed) {
        if (str.isEmpty()) {
            ArrayList<String> al = new ArrayList<>();
            return 1;
        }
        int count = 0;
        char ch = str.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());

            count += permutationNumber(str.substring(1), f + ch + s);
        }
        return count;
    }
}
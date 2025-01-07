public class backtrACkinSubset {

    public static void findSubset(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println(".");
            }
            System.out.println(ans);
            return;
        }

        findSubset(str, ans + str.charAt(i), i + 1);

        findSubset(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        findSubset(str, ans, 0);
    }
}

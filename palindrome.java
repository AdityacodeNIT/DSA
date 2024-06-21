public class palindrome {

    public static boolean ispalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String str = "JAHAJ";

        boolean n = ispalindrome(str);

        if (n == true) {
            System.out.println(str + "  is a palindrome");
        } else if (n == false) {
            System.out.println(str + "  is not a palindrome");
        }
    }
}

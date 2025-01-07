public class SubsetBacktracking {

    public static void subset(String str1, String str2, int i) {

        if (i == str1.length()) {

            if (str2.length() == 0) {
                System.out.println("null");

            } else {
                System.err.println(str2);

            }
            return;
        }
        subset(str1, str2 + str1.charAt(i), i + 1);

        // No
        subset(str1, str2, i + 1);

    }

    public static void main(String[] args) {
        String str = "abc";
        int i = 0;
        String str2 = " ";

        subset(str, str2, i);

    }
}

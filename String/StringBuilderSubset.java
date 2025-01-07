public class StringBuilderSubset {
    public static void subset(StringBuilder str, StringBuilder ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }

            else {
                System.out.println(str);
            }
            return;
        }

        subset(str, ans.append(str.charAt(i)), i + 1);
        ans.delete(i, i);

        subset(str, ans, i + 1);

    }

    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("abc");
        StringBuilder str2 = new StringBuilder(" ");
        int i = 0;
        subset(str1, str2, i);
    }
}

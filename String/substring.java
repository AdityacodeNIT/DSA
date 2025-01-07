public class substring {

    public static void substr(String str, int start, int end) {
        String substr = "";
        for (int i = start; i < end; i++) {

            substr += str.charAt(i);
        }
        System.out.println(substr);
    }

    public static void main(String[] args) {
        String str = "Hello MISS";
        substr(str, 1, 4);

        System.out.println(str.substring(1, 5));

    }
}

public class binaryString {
    public static void bjava(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        bjava(n - 1, 0, str + "0");

        if (lastPlace == 0) {
            bjava(n - 1, 1, str + "1");
        }

    }

    public static void main(String[] args) {
        bjava(4, 0, "");
    }
}

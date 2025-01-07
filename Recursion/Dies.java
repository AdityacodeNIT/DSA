import java.util.ArrayList;

public class Dies {
    public static void main(String[] args) {
        int n = 4;
        String abc = "";
        numberofWays(abc, n);
        int p = 4;
        ArrayList<String> al = new ArrayList<>();
        numberofWays2(abc, p, al);
        System.out.println(al);
    }

    static void numberofWays(String abc, int n) {
        if (n == 0) {
            System.out.println(abc);
            return;
        }

        for (int i = 1; i <= n && i <= 6; i++) {
            numberofWays(abc + i, n - i);

        }
    }

    static void numberofWays2(String abc, int n, ArrayList<String> al) {
        if (n == 0) {
            al.add(abc);
            return;
        }

        for (int i = 1; i <= n && i <= 6; i++) {
            numberofWays2(abc + i, n - i, al);

        }
    }
}

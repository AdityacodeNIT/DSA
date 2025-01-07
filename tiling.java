public class tiling {
    public static int tilling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return tilling(n - 1) + tilling(n - 2);
    }

    public static void duplicate(String str, int idx, StringBuilder newstr, boolean map[]) {

        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            duplicate(str, idx + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            duplicate(str, idx + 1, newstr.append(currchar), map);
        }

    }

    public static int pairUp(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return pairUp(n - 1) + (n - 1) * pairUp(n - 2);

    }

    public static void binaryString(int n, int lastPlace, StringBuilder str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binaryString(n - 1, 0, str.append(0));
        if (lastPlace == 0) {
            binaryString(-1, 1, str.append(1));

        }

    }

    public static void main(String[] args) {
        int n = 4;

        String str = "nitmizoram";
        duplicate(str, 0, new StringBuilder(""), new boolean[26]);

        System.out.println(tilling(n));
        System.out.println(pairUp(n));

    }
}

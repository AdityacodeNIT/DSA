public class RemoveAcharacter {
    public static void main(String[] args) {
        String str = "bccaappeled";
        // StringBuilder st = new StringBuilder();
        System.out.println(removeapple(str));
        // removecharacter(str, st);

        // System.err.println(st);
        System.out.println(removecharacter2(str));
        System.err.println(removeappNotApple(str));

    }

    static void removecharacter(String str, StringBuilder st) {
        if (str.isEmpty()) {
            return;
        }
        char ch = str.charAt(0);
        if (ch != 'a') {
            st.append(ch);
            removecharacter(str.substring(1), st);
        } else {
            removecharacter(str.substring(1), st);
        }
    }

    static String removecharacter2(String str) {
        if (str.isEmpty()) {
            return " ";
        }
        char ch = str.charAt(0);
        if (ch != 'a') {
            return ch + removecharacter2(str.substring(1));
            // for reverse of it add
            // return removecharacter2(str.substring(1))+ch;
        } else {
            return removecharacter2(str.substring(1));
        }

    }

    static String removeapple(String str) {
        if (str.isEmpty()) {
            return " ";
        }

        if (str.startsWith("apple")) {
            return removeapple(str.substring(5));
            // for reverse of it add
            // return removecharacter2(str.substring(1))+ch;
        } else {
            return str.charAt(0) + removeapple(str.substring(1));
        }

    }

    // remove app if appledo not exist
    static String removeappNotApple(String str) {
        if (str.isEmpty()) {
            return " ";
        }

        if (str.startsWith("app") && !str.startsWith("apple")) {
            return removeappNotApple(str.substring(3));
            // for reverse of it add
            // return removecharacter2(str.substring(1))+ch;
        } else {
            return str.charAt(0) + removeappNotApple(str.substring(1));
        }

    }

}

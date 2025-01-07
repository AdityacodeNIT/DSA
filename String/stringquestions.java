public class stringquestions {

    public static void lowerCase(String str) {
        int count = 0;
        // char vowel[] = { 'a', 'b', 'c', 'd', 'e' };
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // for (int j = 0; j < vowel.length; j++) {
            // if (str.charAt(i) == vowel[j]) {
            // count++;
            // }

            // leser time complex code

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        String str = "Aditeya";
        lowerCase(str);

    }
}

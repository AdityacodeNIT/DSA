import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + "," + str2 + " are anagrams");
        } else {
            System.out.println(" are not anagrams");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] str1toArray = str1.toCharArray();
        char[] str2toArray = str2.toCharArray();

        Arrays.sort(str1toArray);
        Arrays.sort(str2toArray);

        return Arrays.equals(str1toArray, str2toArray);
    }
}

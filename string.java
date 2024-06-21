
import java.util.Scanner;

public class string {
    public static void stiring(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        stiring(name);

    }
}

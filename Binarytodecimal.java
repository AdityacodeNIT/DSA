public class Binarytodecimal {

    public static void todecimal(int num) {
        int bineq = 0;
        int i = 0;
        while (num > 0) {
            bineq = bineq + num % 10 * (int) Math.pow(2, i);

            i++;
            num = num / 10;

        }
        System.out.println(bineq);
    }

    public static void main(String[] args) {
        int num = 1010;
        todecimal(num);

    }
}

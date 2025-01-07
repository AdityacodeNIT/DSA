public class swapnum {

    public static void swapNum(int num, int num1) {
        num = num ^ num1;
        num1 = num ^ num1;
        num = num ^ num1;

        System.out.println(num + "," + num1);
    }

    public static void main(String[] args) {
        int num = 3;
        int num1 = 5;
        swapNum(num, num1);

    }
}

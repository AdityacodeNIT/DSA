public class Increasing {
    public static void increasing(int num) {

        if (num >= 0) {

            increasing(num - 1);
            System.out.println(num);

        }

    }

    public static void main(String[] args) {
        int num = 44;
        increasing(num);

    }
}

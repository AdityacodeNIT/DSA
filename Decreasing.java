public class Decreasing {
    public static void decreasing(int num) {

        if (num >= 0) {
            System.out.println(num);
            decreasing(num - 1);

        }

    }

    public static void main(String[] args) {
        int num = 44;
        decreasing(num);

    }
}

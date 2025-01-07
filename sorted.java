public class sorted {

    public static boolean isSorted(int num[], int i) {

        if (i == num.length - 1) {
            return true;
        }
        if ((num[i]) > (num[i + 1])) {

            return false;

        }
        
        return isSorted(num, i+1);

    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 7, 3 };
        int i = 0;
        System.out.println(isSorted(num, i));

    }

}

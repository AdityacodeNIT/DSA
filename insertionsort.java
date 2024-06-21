public class insertionsort {

    public static void arrayprint(int array[]) {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i]);
        }
    }

    public static void insertion(int array[]) {
        for (int i = 1; i < array.length - 1; i++) {
            int current = array[i];
            int prev = i - 1;

            while (prev >= 0 && array[prev] > current) {

                array[prev + 1] = array[prev];
                prev--;
            }
            array[prev + 1] = current;
        }
        arrayprint(array);
    }

    public static void main(String[] args) {
        int array[] = { 5, 3, 1, 4, 6 };
        insertion(array);

    }
}

public class bubbling {

    public static void arrayprint(int array[]) {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i]);
        }
    }

    public static void bubblesorting(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        arrayprint(array);
    }

    public static void main(String[] args) {
        int array[] = { 3, 6, 2, 1, 8, 4, 5, 3, 1 };
        bubblesorting(array);
    }
}

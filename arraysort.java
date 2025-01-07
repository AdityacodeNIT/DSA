public class arraysort {
    public static void arrayprint(int array[]) {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i]);
        }
    }

    public static void bubbleSort(int array[]) {

        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array.length - 2 - i; j++) {
                if (array[j] > array[j + 1]) {

                    int larger = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = larger;
                }

            }

        }
        arrayprint(array);
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 0, 2 };
        bubbleSort(array);
    }
}

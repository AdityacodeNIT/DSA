public class selectionsort {

    public static void arrayprint(int array[]) {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i]);
        }
    }

    public static void SelectionSort(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minpos] > array[j]) {

                    minpos = j;

                }

            }

            int temp = array[minpos];
            array[minpos] = array[i];
            array[i] = temp;

        }
        arrayprint(array);
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 3, 2 };
        SelectionSort(array);
    }

}

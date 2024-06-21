public class selectsort {

    public static void arrayprint(int array[]) {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i]);
        }
    }

    public static void selectingsort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int minpos = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minpos] < array[j]);
                minpos = j;
            }

            int temp = array[minpos];
            array[minpos] = array[i];
            array[i] = temp;

        }
        arrayprint(array);
    }

    public static void main(String[] args) {
        int array[] = { 3, 6, 2, 1, 8, 4, 5, 3, 1 };
        selectingsort(array);
    }
}

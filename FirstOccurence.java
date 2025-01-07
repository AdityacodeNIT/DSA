import java.util.*;

public class firstOccurence {

    public static int firstoccurence(int array[], int key, int i) {
        if (i == array.length) {
            return -1;
        }
        int isFound = firstoccurence(array, key, i + 1);

        if (isFound == -1 && array[i] == key) {
            return i;
        }

        return isFound;

    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 7, 9 };
        int key = 7;
        int i = 0;
        int j = Integer.MIN_VALUE;
        System.out.println(firstoccurence(array, key, i));

    }
}

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 18, 18, 9 };
        int target = 18;

        findElement(arr, target, 0);
        findAllElements(arr, target, 0);
        System.out.println(al);
        ArrayList<Integer> al = new ArrayList<>();
        // Approach 1
        System.out.println(findAllElements2(arr, target, 0, al));

        // Approach 2

        // System.out.println(findAllElements2(arr, target, 0, new ArrayList<>()));

        System.out.println(findAllElements3(arr, target, 0));
    }

    static boolean findElement(int arr[], int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || findElement(arr, target, index + 1);
    }

    // Approach 1
    static ArrayList<Integer> al = new ArrayList<>();

    static void findAllElements(int arr[], int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            al.add(index);
        }
        findAllElements(arr, target, index + 1);

    }

    // AProach 2
    static ArrayList<Integer> findAllElements2(int arr[], int target, int index, ArrayList<Integer> al) {
        if (index == arr.length) {
            return al;
        }
        if (arr[index] == target) {
            al.add(index);
        }
        return findAllElements2(arr, target, index + 1, al);

    }

    // Approach 3
    static ArrayList<Integer> findAllElements3(int arr[], int target, int index) {
        ArrayList<Integer> al = new ArrayList<>();
        if (index == arr.length) {
            return al;
        }
        if (arr[index] == target) {
            al.add(index);
        }
        ArrayList<Integer> allindex = findAllElements3(arr, target, index + 1);
        al.addAll(allindex);
        return al;

    }

}

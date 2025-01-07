import java.util.HashSet;

public class Union {
    public static void union(int arr1[], int arr2[]) {
        HashSet<Integer> h1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            h1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            h1.add(arr2[i]);
        }
        System.out.println(h1);
    }

    public static void Intersection(int arr1[], int arr2[]) {
        HashSet<Integer> h1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            h1.add(arr1[i]);
        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (h1.contains(arr2[i])) {
                count = count + 1;
                System.out.print(arr2[i] + ", ");
                h1.remove(arr2[i]);

            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        union(arr1, arr2);
        Intersection(arr1, arr2);

    }
}

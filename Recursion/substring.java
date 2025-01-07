import java.lang.reflect.Array;
import java.util.ArrayList;

public class substring {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        System.out.println(subset(arr));
    }

    static ArrayList<ArrayList<Integer>> subset(int arr[]) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int last = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = last + 1;
            }
            last = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                ArrayList<Integer> al2 = new ArrayList<>(outer.get(i));
                al2.add(j);
                outer.add(al2);

            }

        }
        return outer;
    }
}

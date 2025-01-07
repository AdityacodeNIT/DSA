import java.util.*;

public class ArraylistMax {
    public static void sort(ArrayList<Integer> list) {
        System.out.println(list);
        Collections.sort(list);
        System.err.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.err.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);

        // int min = Integer.MIN_VALUE;

        // for (int i = 0; i < list.size(); i++) {
        // if (min < list.get(i))
        // min = list.get(i);

        // }
        // System.out.println(min);
        int temp = list.get(1);
        list.set(1, list.get(3));
        list.set(3, temp);

        System.out.println(list);
        sort(list);

    }
}

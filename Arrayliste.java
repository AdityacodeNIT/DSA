import java.util.ArrayList;

public class Arrayliste {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1, 7);

        System.out.print(list);
        System.out.println();

        System.out.println(list.get(3));
        // list.remove(3);
        // System.out.print(list);

        list.set(2, 9);
        System.out.println(list);

        System.out.println(list.contains(8));
    }
}

import java.util.*;

public class MultiDimensionalArrraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(3);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);

        ArrayList<Integer> list3 = new ArrayList<>();

        list2.add(3);
        list2.add(6);
        list2.add(9);
        list2.add(12);
        list2.add(15);

        mainList.add(list1);

        mainList.add(list2);

        mainList.add(list3);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);

            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");

            }
            System.out.println();
        }

    }
}

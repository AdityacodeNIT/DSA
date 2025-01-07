import java.util.*;

public class LinkedHashMape {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Earth", 6);
        lhm.put("Jupiter", 1900);
        lhm.put("Mars", 580);
        System.out.println(lhm.get("Earth"));
        System.out.println(lhm);
    }
}

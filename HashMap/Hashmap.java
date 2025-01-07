import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();
        // these are the weights of the planets in multiplication with 10^24 kg;
        hm.put("Mercury", 0.3);
        hm.put("Venus", 4.6);
        hm.put("Earth", 6.0);
        hm.put("Mars", 0.65);
        hm.put("Jupiter", 1900.0);
        hm.put("Saturn", 570.0);
        hm.put("Uranus", 87.0);
        hm.put("Neptune", 100.0);

        // how to get the weight of something using the key ;

        // double weight = hm.get("Earth");
        // System.out.println(weight + " X 10^24kg");

        // // How to check if a hashmap contains this value or not;
        // // We will be using containsKey in this.
        // System.out.println(hm.containsKey("Earth"));

        // Remove if we pass the key it will remove the key and value pair.
        // hm.remove("Earth");
        Set<String> s = hm.keySet();
        System.out.println(s);

        for (String k : s) {
            System.out.println("Planet " + k + ", " + "Weight= " + hm.get(k) + "x 10^24kg");
        }

        // System.out.println(hm.containsKey("Earth"));

        // System.out.println(hm);

        // Size of hashmap
        // System.out.println(hm.size());
        // hm.clear();
        // System.err.println(hm);

        // System.out.println(hm.isEmpty());
    }
}
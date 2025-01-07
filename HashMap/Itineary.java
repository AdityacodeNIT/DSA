import java.util.HashMap;

public class Itineary {
    public static String getStart(HashMap<String, String> ticket) {
        HashMap<String, String> revMap = new HashMap<>();
        for (String key : ticket.keySet()) {
            revMap.put(ticket.get(key), key);
        }
        for (String key : ticket.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Chennai", "Bengaluru");
        hm.put("Mumbai", "Delhi");
        hm.put("Goa", "Chennai");
        hm.put("Delhi", "Goa");

        String start = getStart(hm);
        System.out.print(start);
        for (String key : hm.keySet()) {
            System.out.print("-> " + hm.get(start));
            start = hm.get(start);
        }
        System.out.println();

    }
}

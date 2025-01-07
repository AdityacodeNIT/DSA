import java.util.HashMap;

public class ValidAnagrams {
    public static boolean isValidAnagram(String k, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        if (k.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < k.length(); i++) {
            Character ch = k.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);
            if (hm.get(ch) != null) {
                if (hm.get(ch) == 1) {
                    hm.remove(ch);
                } 
                
            else {
                    hm.put(ch, hm.get(ch) - 1);
                }

            } else {
                return false;
            }
        }
        return hm.isEmpty();
    }

    public static void main(String[] args) {
        String k = "knee";
        String t = "kaeen";
        System.out.println(isValidAnagram(k, t));
    }
}

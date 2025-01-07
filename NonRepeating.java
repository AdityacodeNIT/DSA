import java.util.LinkedList;
import java.util.Queue;

public class NonRepeating {

    public static void firstNonRepeating(String s) {
        // Queue of the characters is there;
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            // s.char at i se ch nikal jayega
            char ch = s.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

        }
        if (q.isEmpty()) {
            System.out.println(-1 + " ");

        } else {
            System.out.println(q.peek());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "aabccxb";

        firstNonRepeating(str);

    }
}

import java.util.*;

public class HashMapImplementation {
    static class HashMap<K, V> {
        // we used Kand V becuase we do not know the type we are generalizing it;
        // k stands for key and v stands for the value;

        // Inside the node of the linkedlist in the array two values key and value is
        // there
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // this is the size of the linkedlist elements in the array of linkedlists;
        private int N; // this n is size of the linkedlist array

        private LinkedList<Node> bucket[];

        // here we defined our array of linkedlist as bucket;
        @SuppressWarnings("unchcked")
        public HashMap() {
            this.N = 4;
            this.bucket = new LinkedList[4];

            for (int i = 0; i < 4; i++) {
                this.bucket[i] = new LinkedList<>();
                // this will create the linkedlist that are empty on each and every section of
                // our linkeddlist
            }

        }

        public int HashFunction(K key) {
            int hash = key.hashCode();

            return Math.abs(hash) % N;
        }

        public int searchLinkedList(K key, int bI) {
            LinkedList<Node> ll = bucket[bI];
            // we copied the linkedlist that is present on the ll because bucket is array of
            // linkeldlist;
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);

                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;

        }

        @SuppressWarnings("unchecked")
        private void reHash() {
            LinkedList<Node> old[] = bucket;
            bucket = new LinkedList[N * 2];
            N = N * 2;
            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new LinkedList<>();

            }

            for (int i = 0; i < old.length; i++) {
                LinkedList<Node> ll = old[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bI = HashFunction(key);// first of alll we would get the
            int searchll = searchLinkedList(key, bI);// then we will searchj if that key is already present there or
                                                     // else that key is unique;

            if (searchll != -1) {

                Node node = bucket[bI].get(searchll);
                node.value = value;
            }

            else {
                bucket[bI].add(new Node(key, value));
                size++;
            }
            double lambda = (double) size / N;
            if (lambda > 2.0) {
                reHash();
            }

        }

        public V get(K key) {
            int bI = HashFunction(key);// first of alll we would get the
            int searchll = searchLinkedList(key, bI);
            if (searchll != 1) {
                return bucket[bI].get(searchll).value;
            } else {
                return null;
            }
        }

        public boolean containsKey(K key) {
            int bI = HashFunction(key);// first of alll we would get the
            int searchll = searchLinkedList(key, bI);
            if (searchll != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) {
            int bI = HashFunction(key);// first of alll we would get the
            int searchll = searchLinkedList(key, bI);
            if (searchll != -1) {
                Node node = bucket[bI].remove(searchll);
                size--;
                return node.value;
            }

            else {
                return null;
            }

        }

        public boolean isEmpty() {
            return size == 0;
        }
        // as we know we generaly make private int abc[] where the type of array is int
        // inn this case the type of the array is
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();
        hm.put("abc", 3);
        hm.put("bad", 4);
        System.out.println(hm.get("abc"));
        System.out.println(hm.containsKey("bad"));

    }

}

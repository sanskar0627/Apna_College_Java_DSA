import java.util.*;

public class HashMapCode {
    static class HashMap<k, v> {
        private class Node {
            k key;
            v value;

            public Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size;
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.size = 0;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(k key) {
            int hashCode = key.hashCode();
            return Math.abs(hashCode) % buckets.length;
        }

        private int searchInBucket(k key, int bi) {
            LinkedList<Node> bucket = buckets[bi];
            for (int i = 0; i < bucket.size(); i++) {
                if (bucket.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        public void put(k key, v value) {
            int bi = hashFunction(key); // bucket index
            int di = searchInBucket(key, bi); // data index

            if (di != -1) {
                buckets[bi].get(di).value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                size++;
            }

            double lambda = (double) size / buckets.length;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public v get(k key) {
            int bi = hashFunction(key);
            int di = searchInBucket(key, bi);

            if (di != -1) {
                return buckets[bi].get(di).value;
            } else {
                return null;
            }
        }

        public boolean containsKey(k key) {
            int bi = hashFunction(key);
            int di = searchInBucket(key, bi);

            return di != -1;
        }

        public v remove(k key) {
            int bi = hashFunction(key);
            int di = searchInBucket(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                size--;
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<k> keySet() {
            ArrayList<k> keys = new ArrayList<>();

            for (int bi = 0; bi < buckets.length; bi++) {
                for (Node node : buckets[bi]) {
                    keys.add(node.key);
                }
            }

            return keys;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;

            buckets = new LinkedList[oldBuckets.length * 2];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            size = 0;

            for (LinkedList<Node> bucket : oldBuckets) {
                for (Node node : bucket) {
                    put(node.key, node.value);
                }
            }
        }

        public int size() {
            return size;
        }
    }

    // You can test it with a main method
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 140);
        map.put("China", 144);
        map.put("USA", 30);
        map.put("Nepal", 5);
        map.put("Pakistan", 22);

        System.out.println("India: " + map.get("India"));
        System.out.println("Contains 'China'? " + map.containsKey("China"));
        System.out.println("Removed 'USA': " + map.remove("USA"));
        System.out.println("Key Set: " + map.keySet());
        System.out.println("Size: " + map.size());
        System.out.println("Is empty? " + map.isEmpty());
    }
}

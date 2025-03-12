import java.util.*;

public class UsingArray {
    static class queue {
        static int[] arr;
        static int size;
        static int rear;

        queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // Is empty check
        public static boolean isEmpty() {
            return rear == -1;
        }

        // ADD metgod in queue
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("The queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("queue is Empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;

            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("the Queue is Empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        queue q = new queue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println("Peek: " + q.peek());

        System.out.println("Removed: " + q.remove());
        System.out.println("Peek after remove: " + q.peek());

        q.add(60);

        while (!q.isEmpty()) {
            System.out.println("Removing: " + q.remove());
        }

        System.out.println("Removing from empty queue: " + q.remove());
    }

}
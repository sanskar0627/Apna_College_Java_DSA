import java.util.*;

public class CircularQueueArray {
    class CircularQueue{
        static int[] arr;
        static int size;
        static int rear;
        static int front;
        CircularQueue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front=-1;
        }
        // Is empty check
        public static boolean isEmpty() {
            return rear == -1;
        }
        //is the queue is full
        public static boolean isfull() {
            return (rear+1)%size==front;
        }
        //TO add
        public static void add(int data) {
            if (isfull()) {
                System.out.println("The queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //to remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("The Queue is Empty");
                return -1;
            }
            int result=arr[front];
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        //topeek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("the Queue is Empty");
                return -1;
            }
            return arr[front];
        }
        public static void main(String[] args) {
            CircularQueue q = new CircularQueue(5);  // Create a queue of size 5
    
            // Test: Add elements
            q.add(10);
            q.add(20);
            q.add(30);
            q.add(40);
            q.add(50);
    
            System.out.println("Peek: " + q.peek()); // Expected: 10
    
            // Test: Remove elements
            System.out.println("Removed: " + q.remove()); // Expected: 10
            System.out.println("Removed: " + q.remove()); // Expected: 20
    
            // Test: Add more elements to check circular nature
            q.add(60);
            q.add(70);
    
            System.out.println("Peek after adding: " + q.peek()); // Expected: 30
    
            // Test: Queue should now be full
            q.add(80);  // Should print "The queue is full"
    
            // Test: Empty the queue
            while (!q.isEmpty()) {
                System.out.println("Removing: " + q.remove());
            }
    
            // Test: Removing from an empty queue
            System.out.println("Removing from empty queue: " + q.remove()); // Should print "The Queue is Empty" and return -1
        }




    }
    
}

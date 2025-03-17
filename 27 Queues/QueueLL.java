import java.lang.reflect.Method;

public class QueueLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class queue{
        static Node head=null;
        static Node tail=null;
        //Check Empty
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        //add
        public static void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;

        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=head.data;
            if(tail==head){
                tail=head=null;
            }
            else{
                head=head.next;
            }
            return front;

        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("The queue is empty");
                return -1;
            }
            return head.data;

        }
        // Method to display all elements in the queue
        public static void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }

            Node temp = head;
            System.out.print("Queue: ");
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }
    public static void main(String[] args) {
        queue q = new queue();

        q.add(10);
        q.add(20);
        q.add(30);
        q.display(); // Expected: 10 -> 20 -> 30 -> NULL

        System.out.println("Dequeued: " + q.remove());
        q.display(); // Expected: 20 -> 30 -> NULL

        System.out.println("Front element: " + q.peek());

        System.out.println("Is queue empty? " + q.isEmpty());
    }
    
}

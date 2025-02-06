public class Remove {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public static void main(String[] args) {
        // Adding predefined values
        addLast(10);
        addLast(20);
        addLast(30);

        // Printing the linked list before removal
        printList();

        // Removing the first element
        System.out.println("Removed: " + removefirst());

        // Printing the linked list after removal
        printList();
        System.out.println("Removed:Last Element " + removelast());
        printList();

    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static int removefirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        // Normal Removal
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }
    public static int removelast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;

        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;


    }

}

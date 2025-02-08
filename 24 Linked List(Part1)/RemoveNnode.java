public class RemoveNnode {
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

    public static void main(String[] args) {
        // Adding predefined values
        addLast(2);
        addLast(1);
        addLast(0);
        addLast(5);
        addLast(1);
        addLast(2);
        addLast(4);
        addLast(7);

        System.out.println("Before Removing");
        printList();
        delete(4);
        System.out.println("After Removing");
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

    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void delete(int key){
        int size=0;
        Node temp=head;
        while(temp != null){
            temp=temp.next;
            size++;
        }
        if(key==size){
            head=head.next;
            return;
        }
        int i=1;
        int tofind=size-key;
        Node prev=head;
        while(i<tofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

}

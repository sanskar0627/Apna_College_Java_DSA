public class AddLast {
    public static void main(String[] args) {
        AddLast list = new AddLast();
        list.addlast(10);
        list.addlast(15);
        list.addlast(17);
        list.printList();

    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // Create a Node Class
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Create Head And Tail Pointers
    public static Node head;
    public static Node tail;

    // Add LAST Method
    public void addlast(int data) {
        Node neNode = new Node(data);
        // base case
        if (head == null) {
            head = tail = new Node(data);
            return;
        }
        // Link the last node to new Node
        tail.next = neNode;
        tail = neNode;
    }

}

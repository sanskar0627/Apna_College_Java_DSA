public class Reverse {
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
        addLast(2);
        addLast(1);
        addLast(0);
        addLast(5);
        addLast(1);
        addLast(2);
        addLast(4);
        addLast(7);

        // Printing the linked list
        System.out.println("Before Reverse");
        printList();
        revrsee();
        System.out.println("After Reverse");
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
    public static void revrsee(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
}
    


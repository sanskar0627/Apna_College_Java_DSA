import java.util.*;

public class DoubleLL {
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head, tail;
    int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        // Empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    public int removeFirst() {
        // Empty List
        if (head == null) {
            System.out.println("The DLL is Empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        size--;
        // Single List in DLL
        if (head == tail) {
            head = tail = null;
            return val;
        }
        // Multiple List in the DLL
        head = head.next;
        head.prev = null;
        return val;
    }

    public int removelast() {
        if (head == null) {
            System.out.println("The DLL is Empty");
            return Integer.MIN_VALUE;
        }
        int val = tail.data;
        // Single List in DLL
        if (head == tail) {
            head = tail = null;
            return val;
        }
        // Multiple
        tail = tail.prev; // Move tail to the second last node
        tail.next = null; // Remove the reference to the last node
        size--; // Decrease size
        return val;
    }

    public void printList() {
        Node temp = head;
        System.out.println("DLL: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
     
        while(curr !=null){
            next=curr.next;
            //swap
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLL dll = new DoubleLL();
        
        while (true) {
            System.out.println("\nDoubly Linked List Operations:");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Remove First");
            System.out.println("4. Remove Last");
            System.out.println("5. Print List");
            System.out.println("6. Reverse List");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to add at the beginning: ");
                    int firstVal = sc.nextInt();
                    dll.addFirst(firstVal);
                    break;
                case 2:
                    System.out.print("Enter value to add at the end: ");
                    int lastVal = sc.nextInt();
                    dll.addLast(lastVal);
                    break;
                case 3:
                    int removedFirst = dll.removeFirst();
                    if (removedFirst != Integer.MIN_VALUE)
                        System.out.println("Removed first element: " + removedFirst);
                    break;
                case 4:
                    int removedLast = dll.removelast();
                    if (removedLast != Integer.MIN_VALUE)
                        System.out.println("Removed last element: " + removedLast);
                    break;
                case 5:
                    dll.printList();
                    break;
                case 6:
                    dll.reverse();
                    System.out.println("List reversed.");
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

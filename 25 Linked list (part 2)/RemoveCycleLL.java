import java.util.*;

public class RemoveCycleLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
        RemoveCycleLL list = new RemoveCycleLL();
    
    // Creating nodes
    list.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);
    Node fifth = new Node(5);

    // Linking nodes
    list.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = third; // Creating a cycle (5 -> 3)

    System.out.println("Cycle detected: " + detectCycle(list.head));
    
    list.remove(); // Remove cycle

    System.out.println("Cycle detected after removal: " + detectCycle(list.head));
        

    }
    public static void remove(){
        //Delete Cycle
        Node slow =head;
        Node fast =head;
        boolean cycle=false;
        while (fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
            }
            if (!cycle) {
                return;
            }
            slow=head;
            Node prev=null;
            while(slow!=fast){
                prev=fast;
                slow=slow.next;
                fast=fast.next;
            }
            prev.next=null;
        }
    
    public static boolean detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }
}

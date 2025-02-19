import java.util.*;

public class ZigZag {
    public static void main(String[] args) {
        // Add in LL
        addLast(2);
        addLast(1);
        addLast(0);
        addLast(5);
        addLast(1);
        addLast(2);
        addLast(4);
        addLast(7);
        printList(head);
        zig();
        printList(head);
        
    }
    public static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void zig(){
        //Step 1 FInd mid 
        Node slow=head;
        Node fast=head.next;
        while(fast !=null && fast.next !=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        //Step 2 Reverse the 2nd  part of the LL
        Node curr= mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //Now Prev points to the head of the reverse second Half
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        while(left !=null && right !=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;
        }
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
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
}

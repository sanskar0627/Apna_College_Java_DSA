public class PAalindrome {
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
        //checkpalindrome();
        System.out.println(checkpalindrome());


        

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
    //Slow fast approch
    public static Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static boolean checkpalindrome(){
        //base case for empty for single ll
        if(head==null || head.next==null){
            return true;
        }
        //find Mid
        Node midNode=findmid(head);

        //step 2 reverse sewcond half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left = head;
        while(right !=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
}

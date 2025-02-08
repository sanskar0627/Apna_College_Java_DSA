public class SearchLL {
    public class  Node {
        int data;
        Node next;
        public  Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public static Node head;
    public static Node tail;
    //ADDing at Last
    public static void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode(data);
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void main(String[] args) {
        addLast(2);
        addLast(1);
        addLast(0);
        addLast(5);
        addLast(1);
        addLast(2);
        addLast(4);
        addLast(7);

        printList();
        System.out.println("Index of 4: " + searchh(4));
    }
    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Searching using Iterative Method
    public static int searchh(int key){
        Node temp=head;
        int i=0;
        while(temp!= null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return i;
    }

}

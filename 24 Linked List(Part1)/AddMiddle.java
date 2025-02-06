public class AddMiddle {
    public static void main(String[] args) {
        AddMiddle list=new AddMiddle();
        list.addfirst(10);
        list.addfirst(15);
        list.addfirst(17);
        System.out.println("Before Adding:");
        list.printList();
        
        // Adding a value at index 1
        list.middle(1, 12);
        
        System.out.println("After Adding:");
        list.printList();
    }
    //create a node calss
    public class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        } 
    }
    public static  Node head;
    public static  Node tail;

    public  void addfirst(int data) {
        Node newnode = new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public  void middle(int idx,int data) {
        //call ad first in beggning
        if(idx==0){
            addfirst(data);
            return;
        }
        
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1 && temp!=null){
            temp=temp.next;
            i++;
        }
        if (temp == null) {
            System.out.println("Index out of bounds!");
            return;
        }

        newNode.next=temp.next;
        temp.next=newNode;
        

        
    }
    
}

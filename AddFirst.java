
public class AddFirst {
    public static class Node{
        int data;    //store value
        Node next;   // Store reference
    
        public Node(int data){
        this.data=data;     //Assign value
        this.next=null;     // Intially , no next node 
    }
   }
   //Create head and tail pointers
   public static Node head;
   public static Node tail;

   //Implete first add method 
   public void addFirst(int data){
    //Create a new Node
    Node newNode = new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
   }



    public static void main(String[] arg){
        AddFirst list = new AddFirst();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.printList();
        
    }
    

public void printList(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;

    }
    System.out.println("Null");
}
}

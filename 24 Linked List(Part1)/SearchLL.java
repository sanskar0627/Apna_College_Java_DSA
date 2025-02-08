public class SearchLL {
    public static class Node {
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
            head=tail=newNode;
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
        System.out.println("Using ieterative serach");
        System.out.println("Index of 4: " + searchh(4));
        System.out.println("Using recusrive serach");
        System.out.println("Index of 4: " + recserach(4));
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
        return -1;
    }
    //Search using Recursive way
    public static int recserach(int key){
        return helper(head,key);
    }
    //recursive Funnction
    public static int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next ,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

}

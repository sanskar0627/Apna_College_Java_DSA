import java.util.*;
class Node { // Custom Node class
    int data;
    Node left, right;

    Node(int data) { // Constructor
        this.data = data;
        this.left = this.right = null;
    }
}

public class KLevek {
    public static void main(String[] args) {
        // Create a sample tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 2; // Example: Print nodes at level 2 (0-based index)
        System.out.println("Nodes at level " + k + ":");
        level(root, 0, k); // Start from level 0
    }
    public static void level(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        level(root.left,level+1,k);
        level(root.right,level+1,k);
    }
    
}

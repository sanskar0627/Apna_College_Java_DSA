/*
Question:
Given a binary tree, write a function `transform(Node root)` that converts it into a **Sum Tree**.
In a Sum Tree, each node contains the sum of the values of its left and right subtrees in the original tree.
Leaf nodes are converted to 0.

Example:
Input:
        10
       /  \
      -2    6
     / \   / \
    8  -4 7   5

Output (preorder after transform):
        20
       /  \
      4     12
     / \   / \
    0   0 0   0
*/

public class SumTree {

    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        // Build the tree
        Node root = new Node(10);
        root.left = new Node(-2);
        root.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(-4);
        root.right.left = new Node(7);
        root.right.right = new Node(5);
        transform(root);
        System.out.print("Preorder after transformation: ");
        printTree(root, 0);
    }

    public static void printTree(Node root, int space) {
        if (root == null)
            return;

        // Increase distance between levels
        space += 5;

        // Print right subtree first
        printTree(root.right, space);

        // Print current node after space
        System.out.println();
        for (int i = 5; i < space; i++) {
            System.out.print(" ");
        }
        System.out.println(root.data);

        // Print left subtree
        printTree(root.left, space);
    }


    
    public static int transform(Node root) {
        if(root==null){
            return 0;
        }
        int leftchild=transform(root.left);
        int rightchild=transform(root.right);
        int data=root.data;
        root.data=leftchild+rightchild;
        
        return data+root.data;
    }
}

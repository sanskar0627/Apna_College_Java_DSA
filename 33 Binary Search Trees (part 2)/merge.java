// Leetcode-like Question:
// Step 1: Get inorder traversal of both BSTs (sorted arrays)
// Step 2: Merge the two sorted arrays
// Step 3: Convert the final sorted array to a balanced BST


import java.util.*;

public class merge {
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            left = right = null;
        }
    }

    // 🔹 Function to get the inorder traversal of a BST
    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) return;
        getInorder(root.left, arr);
        arr.add(root.val);
        getInorder(root.right, arr);
    }

    // 🔹 Function to create a balanced BST from a sorted array
    public static Node createBST(ArrayList<Integer> arr, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, start, mid - 1);
        root.right = createBST(arr, mid + 1, end);

        return root;
    }

    // Merge two BSTs into one balanced BST
    public static Node mergeBSTs(Node root1, Node root2) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        getInorder(root2, arr2);
        getInorder(root1, arr1);
        int i=0;
        int j=0;
        ArrayList<Integer> finaArr=new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finaArr.add(arr1.get(i));
                i++;
            }
            else{
                finaArr.add(arr2.get(j));
                j++;
            }
        }
        while (i<arr1.size()) {
            finaArr.add(arr1.get(i));
                i++;
        }
        while (j<arr2.size()) {
            finaArr.add(arr2.get(j));
            j++;
        }

        return createBST(finaArr, 0, finaArr.size()-1);
    }

    // 🔹 Function to print inorder traversal for testing
    public static void printInorder(Node root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    // 🔹 Main method for testing
    public static void main(String[] args) {
        // Example BST 1
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        // Example BST 2
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        // 🔄 Call mergeBSTs after implementing
        Node mergedRoot = mergeBSTs(root1, root2);

        // 🖨 Print inorder of merged BST
        System.out.print("Inorder of Merged BST: ");
        printInorder(mergedRoot);
    }
}

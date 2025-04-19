/*
Question:
Given a binary tree and two integers `n` and `k`, write a function `KAncestor` that prints the K-th ancestor of the node with value `n`.
The ancestor is defined as the node that appears `k` levels above the given node in the path from that node to the root.
If there is no such ancestor, do not print anything.

*/


public class kthAncestor {
    static class Node {
        
        int data;
        Node left, right;
    
        Node(int value) {
            data = value;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        int n = 4; // target node
        int k = 2; // Kth ancestor

        KAncestor(root, n, k);
    }
    public static int KAncestor(Node root,int n, int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftdist=KAncestor(root.left, n, k);
        int rightdist=KAncestor(root.right, n, k);
        if(leftdist==-1 && rightdist==-1){
            return -1;
        }
        int max=Math.max(leftdist, rightdist);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }
    
}

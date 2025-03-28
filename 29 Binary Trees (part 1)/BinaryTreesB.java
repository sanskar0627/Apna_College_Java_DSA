import java.util.*;

public class BinaryTreesB {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Binartree{
        static int idx=-1;
        public static Node buildtree(int Node[]) {
            idx++;
            if(Node[idx]==-1){
                return null;
            }
            Node newNode=new Node(Node[idx]);
            newNode.left=buildtree(Node);
            newNode.right=buildtree(Node);
            return newNode;
            
        }
    }
    public static void preorder(Node root) {
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    } 
    public static void inorder(Node root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    } 
    public static void postorder(Node root) {
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");

    }    
    public static void levelorder(Node root) {
        //Base case
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        //statr Bfs
        while(!q.isEmpty()){
            Node curNode=q.remove();
            if(curNode==null){
                System.out.println(" ");
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curNode.data+" ");
                if(curNode.left!=null){
                    q.add(curNode.left);
                }
                if(curNode.right !=null){
                    q.add(curNode.right);
                }
            }
        }
        
    }

    
    public static void main(String[] args) {
        int node[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Binartree tree=new Binartree();
        Node root=tree.buildtree(node);
        //System.out.println(root.data);
        levelorder(root);

    }
    

}
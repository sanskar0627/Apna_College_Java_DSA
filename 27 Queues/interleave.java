//Interleave 2 halves of a queue (even lenght);
import java.util.*;
public class interleave {
    public static void interleaves(Queue<Integer> q) {
        Queue<Integer> firsthalve=new LinkedList<>();
        int size=q.size();
        for(int i=0;i<size/2;i++){
            firsthalve.add(q.remove());
        }
        while(!firsthalve.isEmpty()){
            q.add(firsthalve.remove());
            q.add(q.remove());
        }

        
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println("Before Interleaving: " + q);
        interleaves(q);
        System.out.println("After Interleaving: " + q);
        
    }
    
}

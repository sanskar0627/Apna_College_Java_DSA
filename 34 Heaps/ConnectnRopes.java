// 🔗 Problem: Connect N Ropes (Leetcode 1167)",
// Given N ropes of different lengths, the task is to connect these ropes into one rope",
// with minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.",
// Example: Input = [4, 3, 2, 6], Output = 29",
import java.util.*;
public class ConnectnRopes {
    public static void main(String[] args) {
        int ropes[]={2,3,3,4,6,4,7};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int cost =0;
        while(pq.size()>1){
            int min=pq.remove();
            int min2=pq.remove();
            cost+=min+min2;
            pq.add(min+min2);

        }
        System.out.println("Cost of Connecting n Ropes "+cost);

    }
}

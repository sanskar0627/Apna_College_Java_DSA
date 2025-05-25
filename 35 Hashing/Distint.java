// 💬 QUESTION:
// Given an array of integers, count the number of distinct elements in the array.
// Example:
// Input:  {4, 3, 2, 5, 6, 7, 3, 4, 2, 1}
// Output: 7
// Explanation: The distinct elements are {1, 2, 3, 4, 5, 6, 7} → total = 7
import java.util.*;
public class Distint {
    public static void main(String[] args) {
        int num[]={4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        HashSet <Integer> set=new HashSet<>();
        for(int i=0;i<num.length;i++){
            set.add(num[i]);
        }
        System.out.println("The unique Elemnts in the array are "+set.size());
    }
    
}

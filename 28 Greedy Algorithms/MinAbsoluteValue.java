/*
 Given two arrays A and B of equal length n. Pair each element of array A to an element in array B, 
 such that sum S of absolute differences of all the pairs is minimum.
*/

import java.util.*;

public class MinAbsoluteValue {
    public static void main(String[] args) {
        /*int[] A = {1, 2, 3}; // Example input
        int[] B = {2, 1, 3}; // Example input
        */
        int[] A = {10, -5, 7, 20, 3}; 
        int[] B = {8, -3, 6, 25, 2};
        
        System.out.println(minAbsoluteSumDiff(A, B)); // Function call
    }

    public static int minAbsoluteSumDiff(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int mindiff=0;
        for(int i=0;i<A.length;i++){
            mindiff+=Math.abs(A[i]-B[i]);
        }
       
        return mindiff; // Placeholder return
    }
}

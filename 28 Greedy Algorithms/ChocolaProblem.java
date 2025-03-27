import java.util.Arrays;
import java.util.Collections;

/**
 * Chocola Problem
 *
 * We are given a bar of chocolate composed of m x n square pieces.
 * One should break the chocolate into single squares.
 *
 * Each break of a part of the chocolate is charged a cost expressed by a positive integer.
 * This cost does not depend on the size of the part that is being broken but only depends
 * on the line the break goes along.
 *
 * Let us denote the costs of breaking along consecutive vertical lines with:
 * x1, x2, ..., xm-1
 *
 * And along horizontal lines with:
 * y1, y2, ..., yn-1
 *
 * Compute the minimal cost of breaking the whole chocolate into single squares.
 */

public class ChocolaProblem {
    public static void main(String[] args) {
        // Chocolate dimensions: m x n
        int m = 6, n = 4;

        // Costs for vertical and horizontal cuts
        Integer costVer[] = {2, 1, 3, 1, 4}; // Costs of vertical cuts
        Integer costHor[] = {4, 1, 2};       // Costs of horizontal cuts

        // Step 1: Sort both cost arrays in descending order (Greedy Approach)
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        // Step 2: Initialize tracking variables
        int h = 0, v = 0;  // Index pointers for horizontal and vertical cuts
        int hp = 1, vp = 1; // Number of horizontal and vertical pieces
        int cost = 0;  // Variable to store the total minimum cost

        // Step 3: Use a greedy approach to cut the chocolate
        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) { // If horizontal cut is more expensive or equal
                cost += costHor[h] * vp;  // Multiply cost by the number of vertical pieces
                hp++; // Increase horizontal pieces count
                h++;  // Move to the next horizontal cut
            } else { // If vertical cut is more expensive
                cost += costVer[v] * hp;  // Multiply cost by the number of horizontal pieces
                vp++; // Increase vertical pieces count
                v++;  // Move to the next vertical cut
            }
        }

        // Step 4: If any horizontal cuts remain, process them
        while (h < costHor.length) {
            cost += costHor[h] * vp;
            hp++;
            h++;
        }

        // Step 5: If any vertical cuts remain, process them
        while (v < costVer.length) {
            cost += costVer[v] * hp;
            vp++;
            v++;
        }

        // Step 6: Print the minimum cost required to break the chocolate
        System.out.println("Minimum cost of cuts = " + cost);
    }
    
}

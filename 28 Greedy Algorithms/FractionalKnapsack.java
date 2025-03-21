import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    // Function to get the maximum total value in the knapsack
    static double getMaxValue(int[] val, int[] weight, int W) {
        int n = val.length;

        // Step 1: Create an array to store item index and value-to-weight ratio
        double ratio[][] = new double[n][2]; // 0th col = index, 1st col = ratio

        for (int i = 0; i < n; i++) {
            ratio[i][0] = i; // Store item index
            ratio[i][1] = (double) val[i] / weight[i]; // Calculate value-to-weight ratio
        }

        // Step 2: Sort the ratio array in ascending order based on the ratio value
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W; // Remaining weight capacity of knapsack
        double finalValue = 0; // Store final max value obtained

        // Step 3: Start picking items from the highest value-to-weight ratio
        for (int i = n - 1; i >= 0; i--) { // Traverse from highest ratio to lowest
            int idx = (int) ratio[i][0]; // Get the original index of the item

            // If full item can be included, take it
            if (capacity >= weight[idx]) {
                finalValue += val[idx]; // Add full item value
                capacity -= weight[idx]; // Reduce remaining capacity
            } else {
                // If the item can't be fully taken, take the fractional part
                finalValue += ratio[i][1] * capacity; // Add fractional value
                break; // Knapsack is full
            }
        }

        return finalValue; // Return the maximum total value
    }

    public static void main(String[] args) {
        // Example input
        int val[] = {60, 100, 120}; // Values of items
        int weight[] = {10, 20, 30}; // Weights of items
        int W = 50; // Knapsack weight capacity

        // Compute maximum value that can be obtained
        double maxValue = getMaxValue(val, weight, W);

        // Output the result
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}

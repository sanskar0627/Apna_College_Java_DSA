import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChain {
    public static int findLongestChain(int[][] pairs) {
        // Sort pairs based on the second element (ending value) in ascending order
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));

        int chainLen = 1; // At least one pair can be selected
        int chainEnd = pairs[0][1]; // Initialize with the end of the first pair

        // Iterate through the pairs
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) { // If the start of the current pair is greater than the last selected pair's end
                chainLen++;
                chainEnd = pairs[i][1]; // Update chain end to the current pair's end
            }
        }
        return chainLen; // Return the maximum chain length
    }

    public static void main(String[] args) {
        int[][] pairs = {
            {5, 24},
            {39, 60},
            {5, 28},
            {27, 40},
            {50, 90}
        };

        int result = findLongestChain(pairs);
        System.out.println("Max Length Chain: " + result); // Expected output: 3
    }
}

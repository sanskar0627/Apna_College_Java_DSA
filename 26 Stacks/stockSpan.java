import java.util.Stack;

public class stockSpan {
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>(); // Stack stores indices of stock prices
        span[0] = 1; // First day's span is always 1
        s.push(0); // Push first index into stack

        // Loop through the rest of the days
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i]; // Current day's price

            // **Step 1: Remove smaller prices from stack**
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop(); // Remove previous smaller stock prices
            }

            // **Step 2: Calculate span**
            if (s.isEmpty()) {
                span[i] = i + 1; // If stack is empty, span = i + 1 (all previous prices were smaller)
            } else {
                int prevHigh = s.peek(); // Previous higher price's index
                span[i] = i - prevHigh;  // Span is difference between indices
            }

            // **Step 3: Push current day's index to stack**
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 75, 85};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        // Print the span array
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
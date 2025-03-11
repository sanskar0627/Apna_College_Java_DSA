// Next Greater Element (NGE)
import java.util.*;

public class NextGreater {
    public static void main(String[] args) {
        // Input array
        int arr[] = {6, 8, 0, 1, 3};  

        // Stack to store indices of elements
        Stack<Integer> s = new Stack<>();

        // Array to store the next greater element for each index
        int greater[] = new int[arr.length];

        // Traverse the array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // 1. Remove elements from the stack that are smaller or equal to arr[i]
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // 2. If stack is empty, there is no greater element on the right
            if (s.isEmpty()) {
                greater[i] = -1;
            } 
            // Otherwise, the top of the stack is the next greater element
            else {
                greater[i] = arr[s.peek()];
            }

            // 3. Push current index onto the stack
            s.push(i);
        }

        // Print the next greater elements for each element in the array
        System.out.print("Next Greater Elements: ");
        for (int i = 0; i < greater.length; i++) {
            System.out.print(greater[i] + " ");
        }
        System.out.println(); // Move to a new line for better formatting
    }
}

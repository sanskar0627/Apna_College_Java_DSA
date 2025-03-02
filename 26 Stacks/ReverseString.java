import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Sanskar";
        System.out.println(reverse(str));

    }

    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        // Push all the Character to stack
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        // Adding stack in string
        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }

}

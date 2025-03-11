import java.util.Stack;

public class DuplicateParenthesis {
    public static void main(String[] args) {
        String str = "((a+b))";
        boolean z = duplicate(str);
        System.out.println(z);
    }

    public static boolean duplicate(String str) {
        Stack<Character> s = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Closing parenthesis check
            if (ch == ')') {
                int count = 0;
                
                // Pop until opening '(' is found
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                
                // If no characters between '()', it's a duplicate
                if (count < 1) {
                    return true;
                }
                
                // Pop the '('
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else {
                s.push(ch); // Push other characters
            }
        }
        
        return false; // No duplicates found
    }
}

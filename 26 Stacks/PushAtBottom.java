import java.util.*;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        push(s, 4);
        System.out.println(s);

    }

    public static void push(Stack<Integer> s, int data) {
        // Base case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        push(s, data);
        s.push(top);

    }

}

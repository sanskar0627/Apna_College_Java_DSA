import java.util.*;
public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Original Stack: " + s);
        reverses(s);
        System.out.println("Reversed Stack: " + s);


        
    }
    public static void PushAtBottom(Stack<Integer> s, int data) {
        // Base case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(s, data);
        s.push(top);

    }
    public static void reverses(Stack<Integer> s) {
        //Base case
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverses(s);
        PushAtBottom(s,top);
    }
    
}
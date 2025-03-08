import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "{}[({{}})]";
        boolean z = check(str);
        System.out.println(z);

    }

    public static Boolean check(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }
            // closing
            
            // empty
            else{
            if(s.isEmpty()){
                return false;
            }
            // check and pop
            if((s.peek()=='(' && ch==')')||
                (s.peek()=='{' && ch=='}')||
                (s.peek()=='[' && ch==']')
                ){
                    s.pop();
            }
            else{
                return false;
            }
            // final
        }
        

    }
    if(s.isEmpty()){
        return true;
    }
    else{
        return false;
    }

}}

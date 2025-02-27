import java.util.*;

public class Stacks {
    static ArrayList<Integer> list = new ArrayList<>();

    // EMpty check
    static boolean isempty() {
        return list.size() == 0;
    }

    // push
    public static void push(int data) {
        list.add(data);
    }

    // pop
    public static int pop() {
        if (isempty()) {
            System.out.println("The List is Empty");
            return -1;
        }
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }
    //peek
    public static int peek(){
        if (isempty()) {
            System.out.println("The List is Empty");
            return -1;
        }
        int top = list.get(list.size() - 1);
        return top;
    }
    public static void main(String[] args) {
        Stacks.push(2);
        Stacks.push(1);
        Stacks.push(0);
        Stacks.push(5);
        Stacks.push(1);
        Stacks.push(2);
        Stacks.push(4);
        Stacks.push(7);
        while (!Stacks.isempty()) {
            System.out.println(Stacks.peek());
            Stacks.pop();
        }
    }

}

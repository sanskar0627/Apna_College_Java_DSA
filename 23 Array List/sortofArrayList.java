import java.util.*;
public class sortofArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> Marks=new ArrayList<>();
        Marks.add(89);
        Marks.add(77);
        Marks.add(78);
        Marks.add(91);
        Marks.add(57);
        System.out.println("Original List");
        System.out.println(Marks);
        // Sort in ascending order
        Collections.sort(Marks);
        System.out.println("ascending order");
        System.out.println(Marks);
        // Sort in Desending Order
        Collections.sort(Marks,Collections.reverseOrder());
        System.out.println("Desending Order");
        System.out.println(Marks);
        
    }
    
}

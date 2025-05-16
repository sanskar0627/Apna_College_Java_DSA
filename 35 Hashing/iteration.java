import java.util.*;

public class iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Samosa", 7);
        hm.put("jalebi", 10);
        hm.put("Dahi", 15);
        hm.put("Sandesh", 10);
        hm.put("Rosogulla", 8);
        hm.put("Kachori", 12);
        hm.put("Gulab Jamun", 18);
        hm.put("Lassi", 20);

        Set<String> items = hm.keySet();
        System.out.println(items);// printing keys only

        for (String i : items) {
            System.out.println("The price of " + i + "  is " + hm.get(i));
        }

    }

}

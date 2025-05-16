import java.util.*;

public class basic {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        //Adding
        hm.put("Samosa", 7);
        hm.put("jalebi", 10);
        hm.put("Dahi", 15);
        hm.put("Sandesh", 10);
        hm.put("Rosogulla", 8);
        System.out.println(hm);

        //get Function
        System.out.println(hm.get("Dahi"));
        System.out.println(hm.get("samosa")); //case sensetive
        System.out.println(hm.get("Namkeen"));

        //contains
        System.out.println(hm.containsKey("jalebi"));

        //remove
        System.out.println(hm.remove("jalebi"));
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
    }
}

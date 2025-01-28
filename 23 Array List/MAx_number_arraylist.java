import java.util.*;

public class MAx_number_arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> Marks=new ArrayList<>();
        Marks.add(89);
        Marks.add(77);
        Marks.add(78);
        Marks.add(91);
        Marks.add(57);

        Integer min=Integer.MIN_VALUE;
        for(int i=0;i<Marks.size();i++){
            if(min<Marks.get(i)){
                min=Marks.get(i);
            }
        }
        System.out.println(min);

    }
    
}

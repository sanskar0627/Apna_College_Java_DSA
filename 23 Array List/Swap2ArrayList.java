import java.util.*;

public class Swap2ArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> Marks=new ArrayList<>();
        Marks.add(89);
        Marks.add(77);
        Marks.add(78);
        Marks.add(91);
        Marks.add(57);

        //Swap
        int a=2;
        int b=4;
        System.out.println("Before Swapping");
        for(int i=0;i<Marks.size();i++){
            System.out.print(Marks.get(i)+ " ");

        }
        System.out.println(" ");
        Integer temp;
        //swap
        temp=Marks.get(a);
        Marks.set(a,Marks.get(b));
        Marks.set(b,temp);
        System.out.println("After Swapping");
        for(int i=0;i<Marks.size();i++){
            System.out.print(Marks.get(i)+ " ");

        }


    }
    
}

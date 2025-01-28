import java.util.*;
public class SizeOfArray {

    public static void main(String[] args) {
        // Making an Array List
        ArrayList<Integer> Marks=new ArrayList<>();
        Marks.add(89);
        Marks.add(77);
        Marks.add(78);
        Marks.add(91);
        Marks.add(57);
        System.out.println(Marks.size());
        for(int i=0;i<Marks.size();i++){
            System.out.print(Marks.get(i)+ " ");

        }
        System.out.println("");
        //Reverse the Array list
        for(int i=Marks.size()-1;i>=0;i--){
            System.out.print(Marks.get(i)+ " ");

        }
        

        }
}
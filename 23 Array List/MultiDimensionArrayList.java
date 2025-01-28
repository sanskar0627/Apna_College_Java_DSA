import java.lang.annotation.Target;
import  java .util.*;
public class MultiDimensionArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> Tables=new ArrayList<>();
        //First Sub List
        ArrayList<Integer> Table2=new ArrayList<>();
        Table2.add(2);
        Table2.add(4);
        Table2.add(6);
        Table2.add(8);
        Table2.add(10);
        //Adding the list to main list thatis tables
        Tables.add(Table2);
        //second Sub List TAble of 3
        ArrayList<Integer> Table3=new ArrayList<>();
        Table3.add(3);
        Table3.add(6);
        Table3.add(9);
        Table3.add(12);
        Table3.add(15);
        ////Adding the list to main list thatis tables
        Tables.add(Table3);
        //Third Sub list of table of 4 
        ArrayList<Integer> Table4=new ArrayList<>();
        Table4.add(4);
        Table4.add(8);
        Table4.add(12);
        Table4.add(16);
        Table4.add(20);
        //Adding the list to main list thatis tables
        Tables.add(Table4);


        //Output
        for(int i=0;i<Tables.size();i++){
            //outer loop
            ArrayList<Integer> currlist=Tables.get(i);
            //inner loop
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println(" ");

        }
    }
}
    

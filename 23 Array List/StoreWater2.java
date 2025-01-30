import java.util.*;

public class StoreWater2 {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1 8 6 2 5 4 8 3 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(maxstore(height));

    }
    public static int maxstore(ArrayList<Integer> height) {
        int max=0;
        int lp=0; //Left pointer
        int rp=height.size()-1; //Right Pointer
        while(lp<rp){
            //Calculating the Area 
            int ht=Math.min(height.get(rp), height.get(lp));
            int widht=rp-lp;
            int curr=ht*widht;
            max=Math.max(max, curr);

            //Updating things 
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }

        }
        return max;
        
        
    }

}

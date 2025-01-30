
//Find if any pair is sorted Arraylisst has a target sum.
import java.util.ArrayList;

public class Pairsum1 {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
        height.add(7);
        height.add(8);
        height.add(9);
        int target=7;
        System.out.println(checksum(height, target));
        
    }

    public static boolean checksum(ArrayList<Integer> height,int target) {
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                if(height.get(i)+height.get(j)==target){
                    return true;
                }
               
            }
            
            
        }
        return false;
        
        
    }
    
}

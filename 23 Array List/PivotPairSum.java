import java.util.ArrayList;

public class PivotPairSum {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(11);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);
        int target = 16;
        System.out.println(check(height, target));
        
    }
    public static boolean check(ArrayList<Integer> height,int target) {
        int n=height.size();
        int bp=-1;
        //Finding the Breaking point 
        for(int i=0;i<n-1;i++){
            if(height.get(i)>height.get(i+1)){
                bp=i;
                break;
            }
        }
        //Initilalizing the points starting or ending u can CAll smallest and largest 
        int lp=bp+1;
        int rp=bp;

        //Checking the cases
        while(lp != rp){
            //Case 1 
            if(height.get(lp)+height.get(rp)==target){
                return true;
            }
            //case 2 is the sum is smallest 
            else if(height.get(lp)+height.get(rp)<target){
                lp=(lp+1)%n;
            }
            //cse 3  is the sum is more than the target 
            else{
                rp=(rp+n-1)%n;
            }


        }
        return false;
        
    }
    
}


/*Monotonic ArrayList (EASY)
An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An
Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
Sample Input 1 : nums = [1,2,2,3]
Sample Output 1 : true
Sample Input 2 : nums = [6,5,4,4]
Sample Output 2 : true
Sample Input 3 : nums = [1,3,2]
Sample Output 3 : false
Constraints :
 */
//--------------------------------------------------------------------------------------
import java.util.*;

public class MonotonicArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> monotonic = new ArrayList<>();
        System.out.println("Enter the number of Elemnets ");
        int n = sc.nextInt();
        System.out.println("Enter" + n + "Numbers in the Array List");
        for (int i = 0; i < n; i++) {
            monotonic.add(sc.nextInt());

        }
        System.out.println("ArrayList elements: " + monotonic);
        System.out.println(check(monotonic));

    }

    public static boolean check(ArrayList<Integer> monotonic) {
        boolean increasing=true;
        boolean decreasing=true;
        for (int i=0;i<monotonic.size()-1;i++){
            if(monotonic.get(i) > monotonic.get(i+1)){
                increasing=false;
            }
            if(monotonic.get(i) < monotonic.get(i+1)){
                decreasing=false;
            }

        }
        return increasing||decreasing;
    }
}

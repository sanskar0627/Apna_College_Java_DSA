import java.util.ArrayList;

public class pairsum2 {
    // using pointers
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
        int target = 7;
        System.out.println(check(height, target));
    }

    public static boolean check(ArrayList<Integer> height, int target) {
        int max = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            if (height.get(rp) + height.get(lp) == target) {
                return true;
            }
            else if (height.get(rp) + height.get(lp) > target) {
                rp--;
            } else {
                lp++;
            }

        }
        return false;

    }

}

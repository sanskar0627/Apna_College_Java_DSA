/*
    Problem: Minimum Number of Coins

    We are given an infinite supply of denominations: [1, 2, 5, 10, 20, 50, 100, 500, 2000].
    The task is to find the minimum number of coins/notes required to make change for a given value V.

    Example 1:
    Input: V = 121
    Output: 3
    Explanation: 121 can be formed using (100 + 20 + 1)

    Example 2:
    Input: V = 590
    Output: 4
    Explanation: 590 can be formed using (500 + 50 + 20 + 20)
*/
import java.util.*;

public class MinimumNumberofCoins {
    public static void main(String[] args) {
        // Test cases
        int V1 = 121;
        int V2 = 590;

        System.out.println("Minimum coins for " + V1 + " = " + minCoins(V1));
        System.out.println("Minimum coins for " + V2 + " = " + minCoins(V2));
    }
    public static int minCoins(int v) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());

        int count=0;
        ArrayList <Integer> ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]<= v){
                while (coins[i]<= v) {
                    count++;
                    ans.add(coins[i]);
                    v-=coins[i];
                }
            }
        }
        return count;

        
    }
    
}

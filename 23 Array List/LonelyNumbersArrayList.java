/*
 * You are given an integer arraylist nums. A number x is lonely when it appears only once, and
no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
Return all lonely numbers in nums. You may return the answer in any order.
Sample Input 1 : nums = [10,6,5,8]
Sample Output 1 : [10,8]
Explanation :
- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
- 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums. rajakash3852@gmail.com
- 5 is not a lonely number since 6 appears in nums and vice versa.
Hence, the lonely numbers in nums are [10, 8].
Note that [8, 10] may also be returned.
Sample Input 2 : nums = [1,3,5,3]
Sample Output 2 : [1,5]
Explanation :
- 1 is a lonely number since it appears exactly once and 0 and 2 does not appear in nums.
- 5 is a lonely number since it appears exactly once and 4 and 6 does not appear in nums.
- 3 is not a lonely number since it appears twice.
Hence, the lonely numbers in nums are [1, 5].
Note that [5, 1] may also be returned.

 */

 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class LonelyNumbersArrayList {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         ArrayList<Integer> check = new ArrayList<>();
         System.out.println("Enter the number of Elements: ");
         int n = sc.nextInt();
         System.out.println("Enter " + n + " Numbers in the Array List:");
         for (int i = 0; i < n; i++) {
             check.add(sc.nextInt());
         }
         System.out.println("ArrayList elements: " + check);
         System.out.println("Lonely numbers: " + lonely(check));
     }
 
     public static ArrayList<Integer> lonely(ArrayList<Integer> check) {
         ArrayList<Integer> result = new ArrayList<>();
         for (int i = 0; i < check.size(); i++) {
             int num = check.get(i);
             int count = 0;
             // Count the frequency of the current number
             for (int j = 0; j < check.size(); j++) {
                 if (check.get(j) == num) {
                     count++;
                 }
             }
             // Check if it's lonely (appears only once, and no adjacent numbers are present)
             if (count == 1 && !check.contains(num - 1) && !check.contains(num + 1)) {
                 result.add(num);
             }
         }
         return result;
     }
 }
 

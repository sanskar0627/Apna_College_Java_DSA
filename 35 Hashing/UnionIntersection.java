
        // Question:
        // Given two arrays:
        // arr1 = {7, 3, 9}
        // arr2 = {6, 3, 9, 2, 9, 4}
        //
        // You need to find:
        // 1. The Union of both arrays (all unique elements from both arrays).
        // 2. The Intersection of both arrays (common elements present in both arrays).
        //
        // Output:
        // Union = 6 → {7, 3, 9, 6, 2, 4}
        // Intersection = 2 → {3, 9}

import java.util.HashSet;

public class UnionIntersection {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        //UNION
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println("There are "+set.size()+" Union in the both the arrays");
        System.out.println(set);

        set.clear();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                System.out.println(arr2[i]);
                set.remove(arr2[i]);
            }
        }

    }
    
}

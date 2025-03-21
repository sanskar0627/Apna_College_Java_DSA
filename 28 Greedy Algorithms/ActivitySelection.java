/*
The problem statement describes the Activity Selection Problem, which is a classic Greedy Algorithm problem.
Explanation:
-You are given n activities, each with a start time and an end time.
-A single person can only perform one activity at a time (i.e., they cannot overlap).
-The goal is to select the maximum number of activities that can be performed without overlap.
-The activities are sorted according to their end time.
 */
import java.lang.reflect.Array;
import java.util.*;;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        //sortedEnd(start, end);
        UnsortedEnd(start, end);
        
    }
    //Sorted Array
    public static void sortedEnd(int start[],int end[]) {
        int maxact=0;
        ArrayList<Integer> ans=new ArrayList<>();
        maxact=1;
        ans.add(0);
        int lastend=end[0];
        for (int i=1;i<end.length;i++){
            if(start[i]>=lastend){
                maxact++;
                ans.add(i);
                lastend=end[i];
            }

        }
        System.out.println("The max Act it can perform is "+maxact);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println("");
    }
    ///Unsorted ends
    public static void UnsortedEnd(int start[],int end[]) {
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;//Activity index
            activities[i][1]=start[i];//start
            activities[i][2]=end[i];//end
        }
        //On the basis of ending its getting sorted ;
        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));
        int maxact=1;
        ArrayList <Integer> ans=new ArrayList<>();
        ans.add(activities[0][0]);
        int lastend=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastend){
                maxact++;
                ans.add(activities[i][0]);
                lastend=activities[i][2];
            }

        }
        System.out.println("The max Act it can perform is "+maxact);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println("");
    


        
    }

    
}

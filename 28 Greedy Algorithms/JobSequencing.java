/*
    Job Sequencing Problem

    Given an array of jobs where every job has a deadline and a profit if the job is finished 
    before the deadline. It is also given that every job takes a single unit of time, 
    so the minimum possible deadline for any job is 1. 

    The goal is to maximize the total profit if only one job can be scheduled at a time.

    Example:
    
    Jobs: 
    Job A -> Deadline = 4, Profit = 20
    Job B -> Deadline = 1, Profit = 10
    Job C -> Deadline = 1, Profit = 40
    Job D -> Deadline = 1, Profit = 30

    Output:
    Maximum profit sequence: C, A
*/

import java.util.Arrays;

class Job {
    char id;
    int deadline, profit;

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencing {
    public static void jobSequencing(Job[] jobs) {
        // Step 1: Sort jobs in descending order of profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Step 2: Find the maximum deadline
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // Step 3: Create a slot array to keep track of filled slots
        char[] result = new char[maxDeadline]; // Stores job sequence
        boolean[] slotFilled = new boolean[maxDeadline]; // Slot availability

        int totalProfit = 0;

        // Step 4: Assign jobs to available slots
        for (Job job : jobs) {
            for (int j = Math.min(job.deadline - 1, maxDeadline - 1); j >= 0; j--) {
                if (!slotFilled[j]) { // If slot is available
                    result[j] = job.id; // Assign job
                    slotFilled[j] = true; // Mark slot as filled
                    totalProfit += job.profit; // Update total profit
                    break;
                }
            }
        }

        // Step 5: Print the scheduled jobs and total profit
        System.out.print("Scheduled Jobs: ");
        for (char c : result) {
            if (c != '\0') System.out.print(c + " ");
        }
        System.out.println("\nTotal Profit: " + totalProfit);
    }

    public static void main(String[] args) {
        Job[] jobs = {
            new Job('A', 4, 20),
            new Job('B', 1, 10),
            new Job('C', 1, 40),
            new Job('D', 1, 30)
        };

        jobSequencing(jobs);
    }
}


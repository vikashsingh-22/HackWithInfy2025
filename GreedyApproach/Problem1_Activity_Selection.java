package GreedyApproach;
import java.util.*;

public class Problem1_Activity_Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of activities: ");
        int rows = sc.nextInt();
        int cols = 2;

        int[][] activities = new int[rows][cols];

        System.out.println("Enter start and end time for each activity:");
        for (int i = 0; i < rows; i++) {
            activities[i][0] = sc.nextInt();
            activities[i][1] = sc.nextInt();
        }

        
        Arrays.sort(activities, (a, b) -> Integer.compare(a[1], b[1]));

        
        int count = 1;
        int lastEndTime = activities[0][1];

        for (int i = 1; i < rows; i++) {
            if (activities[i][0] >= lastEndTime) {
                count++;
                lastEndTime = activities[i][1];
            }
        }

        System.out.println("Maximum number of non-overlapping activities: " + count);
    }
}

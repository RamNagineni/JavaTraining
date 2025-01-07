import java.util.Scanner;

public class DailyStepTracker {
    public static void main(String[] args) {
        int daysInWeek = 7;

        int[] dailySteps = new int[daysInWeek];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < daysInWeek; i++) {
            System.out.print("Enter the steps taken on day " + (i + 1) + ": ");
            dailySteps[i] = scanner.nextInt();
        }

        int totalSteps = 0;
        for (int steps : dailySteps) {
            totalSteps += steps;
        }
        double averageSteps = (double) totalSteps / daysInWeek;

        System.out.println("\nStep Tracking Summary:");
        System.out.println("Total steps for the week: " + totalSteps);
        System.out.printf("Average steps per day: %.2f\n", averageSteps);

        scanner.close();
    }
}

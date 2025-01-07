import java.util.Scanner;

public class TrafficMonitoringSystem {
    public static void main(String[] args) {
        int intervals = 12;

        int[] vehicleCounts = new int[intervals];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < intervals; i++) {
            System.out.print("Enter the number of vehicles passing in interval " + (i + 1) + " (5 minutes): ");
            vehicleCounts[i] = scanner.nextInt();
        }

        int totalVehicles = 0;
        for (int count : vehicleCounts) {
            totalVehicles += count;
        }
        double averageVehicles = (double) totalVehicles / intervals;

        System.out.println("\nTraffic Monitoring Summary:");
        System.out.println("Total number of vehicles: " + totalVehicles);
        System.out.printf("Average vehicles per interval: %.2f\n", averageVehicles);

        scanner.close();
    }
}

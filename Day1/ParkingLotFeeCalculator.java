import java.util.Scanner;

public class ParkingLotFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vehicles: ");
        int numVehicles = scanner.nextInt();

        int[] parkingDurations = new int[numVehicles];

        for (int i = 0; i < numVehicles; i++) {
            System.out.print("Enter the parking duration (in hours) for vehicle " + (i + 1) + ": ");
            parkingDurations[i] = scanner.nextInt();
        }

        System.out.println("\nParking Fees:");
        for (int i = 0; i < numVehicles; i++) {
            int hours = parkingDurations[i];
            int fee;

            if (hours <= 5) {
                fee = hours * 2; 
            } else {
                fee = (5 * 2) + ((hours - 5) * 1);
            }

            System.out.printf("Vehicle %d: Duration = %d hours, Fee = $%d\n", (i + 1), hours, fee);
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class EmployeeAttendanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = sc.nextInt();

        String[][] attendance = new String[numEmployees][7];

        System.out.println("\nEnter attendance for each employee for 7 days (Present/Absent):");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                attendance[i][j] = sc.next();
            }
        }

        System.out.println("\nAttendance Record for the Week:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(attendance[i][j] + " ");
            }
            System.out.println();
        }
    }
}
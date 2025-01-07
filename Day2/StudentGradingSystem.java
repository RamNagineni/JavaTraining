import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        double totalGrades = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the grade for Student " + i + ": ");
            int grade = sc.nextInt();

            if (grade < 40) {
                System.out.println("Student " + i + " has failed.");
            }

            totalGrades += grade; 
        }

        double average = totalGrades / n;

        System.out.printf("\nThe average grade for the class is: %.2f\n", average);
    }
}
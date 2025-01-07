import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Are you a citizen of the country? (yes/no): ");
        String citizenship = scanner.nextLine().trim().toLowerCase();

        if (age >= 18 && citizenship.equals("yes")) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
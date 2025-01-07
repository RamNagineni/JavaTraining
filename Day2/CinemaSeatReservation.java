import java.util.Scanner;

public class CinemaSeatReservation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] seats = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                seats[i][j] = 'A';
            }
        }

        String continueReservation = "Yes";
        while (continueReservation.equalsIgnoreCase("Yes")) {
            displaySeats(seats);

            System.out.println("Enter the row (1-5): ");
            int row = sc.nextInt() - 1; 
            System.out.println("Enter the column (1-5): ");
            int col = sc.nextInt() - 1;

            if (row >= 0 && row < 5 && col >= 0 && col < 5) {
                if (seats[row][col] == 'A') {
                    seats[row][col] = 'R';
                    System.out.println("Seat reserved successfully!");
                } else {
                    System.out.println("Sorry, this seat is already reserved.");
                }
            } else {
                System.out.println("Invalid seat choice. Please choose a valid seat.");
            }

            System.out.println("Do you want to continue reserving seats? (Yes/No)");
            continueReservation = sc.next();
        }

        System.out.println("Thank you for using the Cinema Seat Reservation System!");
        sc.close();
    }

    public static void displaySeats(char[][] seats) {
        System.out.println("Cinema Seat Arrangement:");
        System.out.println("Rows: 1 2 3 4 5");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " "); 
            for (int j = 0; j < 5; j++) {
                System.out.print(seats[i][j] + " "); 
            }
            System.out.println();
        }
    }
}

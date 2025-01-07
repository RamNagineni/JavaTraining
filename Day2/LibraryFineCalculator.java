import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books with overdue fines: ");
        int numBooks = sc.nextInt();

        double totalFine = 0;

        for (int i = 1; i <= numBooks; i++) {
            System.out.print("\nEnter the number of overdue days for Book " + i + ": ");
            int overdueDays = sc.nextInt();

            double bookFine = 0;

            if (overdueDays <= 7) {
                bookFine = overdueDays * 1;
            } else {
                bookFine = (7 * 1) + ((overdueDays - 7) * 2);
            }

            System.out.printf("Fine for Book %d: $%.2f\n", i, bookFine);
            totalFine += bookFine;
        }

        System.out.printf("\nTotal Fine for all books: $%.2f\n", totalFine);
    }
}
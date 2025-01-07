import java.util.Scanner;

public class BankTransactionHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 1000.00;
        String transactionType;
        double amount;
        String continueTransaction = "Yes";

        System.out.println("Welcome to the Bank!");

        do {
            System.out.println("\nEnter transaction type (Deposit/Withdraw): ");
            transactionType = sc.nextLine().trim();

            if (transactionType.equalsIgnoreCase("Deposit")) {
                System.out.print("Enter the amount to deposit: $");
                amount = sc.nextDouble();
                sc.nextLine();

                if (amount > 0) {
                    balance += amount;
                    System.out.printf("Deposited: $%.2f\n", amount);
                } else {
                    System.out.println("Invalid amount! Please enter a positive number.");
                }
            }
            else if (transactionType.equalsIgnoreCase("Withdraw")) {
                System.out.print("Enter the amount to withdraw: $");
                amount = sc.nextDouble();
                sc.nextLine(); 

                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    System.out.printf("Withdrawn: $%.2f\n", amount);
                } else if (amount > balance) {
                    System.out.println("Insufficient balance for the withdrawal.");
                } else {
                    System.out.println("Invalid amount! Please enter a positive number.");
                }
            } else {
                System.out.println("Invalid transaction type! Please enter 'Deposit' or 'Withdraw'.");
            }

            System.out.printf("Updated Balance: $%.2f\n", balance);

            System.out.print("Do you want to make another transaction? (Yes/No): ");
            continueTransaction = sc.nextLine();

        } while (continueTransaction.equalsIgnoreCase("Yes"));

        System.out.println("Thank you for using the Bank. Your final balance is: $" + balance);
    }
}

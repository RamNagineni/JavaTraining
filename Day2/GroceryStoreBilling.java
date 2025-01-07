import java.util.Scanner;

public class GroceryStoreBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int numCustomers = sc.nextInt();

        for (int i = 1; i <= numCustomers; i++) {
            System.out.println("\nProcessing items for Customer " + i);

            double totalBill = 0;
            String continueShopping;

            do {
                System.out.print("Enter the item price: $");
                double price = sc.nextDouble();

                System.out.print("Enter the quantity of the item: ");
                int quantity = sc.nextInt();

                totalBill += price * quantity;

                System.out.print("Do you want to add another item? (Yes/No): ");
                continueShopping = sc.next();
            } while (continueShopping.equalsIgnoreCase("Yes"));

            System.out.printf("Total bill for Customer %d: $%.2f\n", i, totalBill);
        }

        System.out.println("\nAll customers have been processed. Thank you for shopping with us!");
    }
}

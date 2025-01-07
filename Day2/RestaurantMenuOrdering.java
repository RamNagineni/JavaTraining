import java.util.Scanner;

public class RestaurantMenuOrdering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menuItems = { "Burger", "Pizza", "Pasta", "Fries", "Coke", "Ice Cream" };
        double[] prices = { 5.99, 8.99, 7.49, 3.49, 1.99, 2.99 };

        System.out.println("Welcome to the Restaurant!");
        System.out.println("Here is our menu:");

        for (int i = 0; i < menuItems.length; i++) {
            System.out.printf("%d. %s - $%.2f\n", i + 1, menuItems[i], prices[i]);
        }

        String continueOrdering = "Yes";
        double totalCost = 0;
        StringBuilder orderSummary = new StringBuilder();

        do {
            System.out.print("\nEnter the number of the item you want to order: ");
            int choice = sc.nextInt();

            if (choice < 1 || choice > menuItems.length) {
                System.out.println("Invalid choice. Please select a valid menu item.");
                continue;
            }

            System.out.print("Enter the quantity: ");
            int quantity = sc.nextInt();

            totalCost += prices[choice - 1] * quantity;
            orderSummary.append(quantity).append(" x ").append(menuItems[choice - 1]).append(" - $")
                        .append(prices[choice - 1] * quantity).append("\n");

            System.out.print("Do you want to add another item? (Yes/No): ");
            continueOrdering = sc.next();
        } while (continueOrdering.equalsIgnoreCase("Yes"));

        System.out.println("\nYour Order:");
        System.out.println(orderSummary);
        System.out.printf("Total Cost: $%.2f\n", totalCost);

        System.out.println("\nThank you for dining with us!");
    }
}

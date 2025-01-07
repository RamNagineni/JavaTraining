import java.util.Scanner;

public class ProductStockChecker {

    public static void main(String[] args) {
        String[] products = {"Product A", "Product B", "Product C", "Product D", "Product E"};
        int[] stock = {15, 5, 30, 2, 10}; 
        int reorderThreshold = 10;

        Scanner sc = new Scanner(System.in);

        System.out.println("Warehouse Stock Management System");
        for (int i = 0; i < products.length; i++) {
            System.out.printf("Checking stock for %s...\n", products[i]);
            System.out.println("Current stock: " + stock[i]);
            
            if (stock[i] < reorderThreshold) {
                System.out.println("Stock is below threshold. Reorder needed for " + products[i] + ".\n");
            } else {
                System.out.println("Stock is sufficient for " + products[i] + ".\n");
            }
        }

        String continueUpdating;
        do {
            System.out.print("Would you like to update the stock of a product? (Yes/No): ");
            continueUpdating = sc.next();

            if (continueUpdating.equalsIgnoreCase("Yes")) {
                System.out.println("Select the product number to update (1-5): ");
                for (int i = 0; i < products.length; i++) {
                    System.out.println((i + 1) + ". " + products[i]);
                }

                int productChoice = sc.nextInt() - 1; 

                if (productChoice >= 0 && productChoice < products.length) {
                    System.out.print("Enter the new stock value for " + products[productChoice] + ": ");
                    stock[productChoice] = sc.nextInt();
                    System.out.println("Stock updated successfully!");
                } else {
                    System.out.println("Invalid product choice. Please try again.");
                }
            }

        } while (continueUpdating.equalsIgnoreCase("Yes"));

        System.out.println("\nFinal Stock Check:");
        for (int i = 0; i < products.length; i++) {
            System.out.printf("Final stock for %s: %d\n", products[i], stock[i]);
            if (stock[i] < reorderThreshold) {
                System.out.println("Reorder needed for " + products[i] + ".\n");
            } else {
                System.out.println("Stock is sufficient for " + products[i] + ".\n");
            }
        }

        System.out.println("\nEnd of Stock Check");
    }
}
import java.util.Scanner;

public class ProductDiscountFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();

        double[] prices = new double[numProducts];
        double[] discounts = new double[numProducts];

        for (int i = 0; i < numProducts; i++) {
            System.out.print("Enter the price of product " + (i + 1) + ": ");
            prices[i] = scanner.nextDouble();

            System.out.print("Enter the discount percentage for product " + (i + 1) + ": ");
            discounts[i] = scanner.nextDouble();
        }

        System.out.println("\nDiscounted Prices:");
        for (int i = 0; i < numProducts; i++) {
            double discountedPrice = prices[i] - (prices[i] * discounts[i] / 100);
            System.out.printf("Product %d: Original Price = %.2f, Discount = %.2f%%, Discounted Price = %.2f\n",
                    (i + 1), prices[i], discounts[i], discountedPrice);
        }

        scanner.close();
    }
}

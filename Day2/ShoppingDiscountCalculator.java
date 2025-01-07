import java.util.Scanner;

public class ShoppingDiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total amount of items: ");
        double total = sc.nextDouble();

        double finalPrice;

        if (total > 500) {
            finalPrice = total - (total * 0.10); 
            System.out.println("A 10% discount has been applied.");
        } else if (total >= 200) {
            finalPrice = total - (total * 0.05); 
            System.out.println("A 5% discount has been applied.");
        } else {
            finalPrice = total; 
            System.out.println("No discount applied.");
        }

        System.out.printf("The final price after discount is: $%.2f\n", finalPrice);
    }
}

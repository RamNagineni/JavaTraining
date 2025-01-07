import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        double convertedTemperature;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
                convertedTemperature = (celsius * 9 / 5) + 32;
                System.out.printf("Temperature in Fahrenheit: %.2f°F\n", convertedTemperature);
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                convertedTemperature = (fahrenheit - 32) * 5 / 9;
                System.out.printf("Temperature in Celsius: %.2f°C\n", convertedTemperature);
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }
    }
}
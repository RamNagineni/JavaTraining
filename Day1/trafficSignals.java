import java.util.Scanner;

public class trafficSignals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the traffic light color (Green, Yellow, Red): ");
        String lightColor = scanner.nextLine().trim().toLowerCase();


        System.out.print("Is there an obstacle? (yes/no): ");
        String obstacleInput = scanner.nextLine().trim().toLowerCase();
        boolean hasObstacle = obstacleInput.equals("yes");

        if (hasObstacle) {
            System.out.println("Stop! There is an obstacle.");
        } else if (lightColor.equals("green")) {
            System.out.println("Go.");
        } else if (lightColor.equals("yellow")) {
            System.out.println("Slow Down.");
        } else if (lightColor.equals("red")) {
            System.out.println("Stop.");
        } else {
            System.out.println("Invalid traffic light color.");
        }
    }
}

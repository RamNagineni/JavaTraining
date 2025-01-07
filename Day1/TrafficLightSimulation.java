import java.util.Scanner;

public class TrafficLightSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the traffic light color (Red, Yellow, Green): ");
        String color = sc.nextLine().trim();

        switch (color.toLowerCase()) { 
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Get Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid input. Please enter Red, Yellow, or Green.");
        }
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class TicketApp {
    public static void main(String[] args) {
        TicketApp em = new TicketApp();
        Scanner sc = new Scanner(System.in);

        String[] AvailableTickets = {
            "Tatkal",
            "General",
            "Premium",
            "FirstClass",
            "AdvanceTickets",
            "SleeperClass",
            "ACExclusiveClass"
        };

        
        Arrays.sort(AvailableTickets);

        String chString = "No";
        int price = 0;

        
        System.out.println("Available Tickets in List: " + Arrays.toString(AvailableTickets));

        do {
            
            System.out.println("Enter the ticket type from the list above:");
            String Ticket = sc.nextLine();

            
            if (Arrays.binarySearch(AvailableTickets, Ticket) >= 0) {
                
                price += em.prizeChar(Ticket);

                System.out.println("Do you want to continue booking? Type Yes/No:");
                chString = sc.nextLine();
            } else {
                System.out.println("Ticket is not available. Please select a valid ticket.");
            }
        } while (chString.equalsIgnoreCase("Yes"));

        
        System.out.println("Thanks for booking! The total cost of your tickets is: " + price);
    }

    
    public int prizeChar(String Ticket) {
        int price = 0;
        switch (Ticket) {
            case "Tatkal":
                price = 1200;
                break;
            case "General":
                price = 100;
                break;
            case "Premium":
                price = 1000;
                break;
            case "FirstClass":
                price = 1800;
                break;
            case "AdvanceTickets":
                price = 2000;
                break;
            case "SleeperClass":
                price = 600;
                break;
            case "ACExclusiveClass":
                price = 3000;
                break;
            default:
                System.out.println("Invalid ticket type.");
                break;
        }
        return price;
    }
}
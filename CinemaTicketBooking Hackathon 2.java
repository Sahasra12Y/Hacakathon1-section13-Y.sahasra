import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    // Parameterized constructor
    MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // Calculate total ticket amount
    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    // Calculate discount
    double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0.0;
    }

    // Calculate final amount
    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    // Display complete bill
    void displayBill() {
        System.out.println("\n----- Cinema Ticket Booking Bill -----");
        System.out.println("Movie Name      : " + movieName);
        System.out.printf("Ticket Price    : %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Total Amount    : %.2f%n", calculateTotal());
        System.out.printf("Discount        : %.2f%n", calculateDiscount());
        System.out.printf("Final Amount    : %.2f%n", calculateFinalAmount());
    }
}

public class CinemaTicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter ticket price: ");
        double ticketPrice = scanner.nextDouble();

        System.out.print("Enter number of tickets: ");
        int numberOfTickets = scanner.nextInt();

        // Create object using parameterized constructor
        MovieTicket ticket = new MovieTicket(
                movieName, ticketPrice, numberOfTickets);

        // Display booking bill
        ticket.displayBill();

        scanner.close();
    }
}


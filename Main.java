import java.util.Date;
import java.util.Scanner;
import lab3task3.Customer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an Agent
        Agent agent = new Agent();
        
        // Simulate customer interaction
        System.out.println("Enter customer details:");
        System.out.print("Customer ID: ");
        char customerId = scanner.next().charAt(0);
        System.out.print("Name: ");
        char name = scanner.next().charAt(0);
        System.out.print("Address: ");
        char address = scanner.next().charAt(0);
        System.out.print("Phone Number: ");
        int phoneNo = scanner.nextInt();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        
        Customer customer = new Customer();
        // Assuming addDetails method has been implemented to set the details.
        customer.addDetails(); // Method should set customer details

        // Simulate ticket booking process
        System.out.println("Booking a ticket...");
        agent.searchTicket(); // Searching for a ticket
        agent.bookTicket();   // Booking a ticket
        agent.fillDetails();  // Filling in booking details
        agent.makePayment();  // Making payment
        
        // Create a ticket
        Ticket ticket = new Ticket();
        // Assuming constructor and methods are properly defined
        // ticket.set...(); // Set the ticket details here

        // Simulate ticket cancellation
        System.out.println("Cancelling a ticket...");
        agent.cancelTicket(); // Cancel the ticket

        // Simulate refund process
        Refund refund = new Refund();
        refund.refundAmount(); // Refund the ticket price

        scanner.close();
    }
}



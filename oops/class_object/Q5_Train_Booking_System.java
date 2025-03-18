/*
Problem Statement:
Design a train ticket booking system similar to IRCTC
where passengers can book train tickets, check available seats, and cancel bookings.

1️⃣ Train Class
Represents a train and its available seats.
trainNumber (String)
trainName (String)
totalSeats (int)
availableSeats (int)
bookTicket(Passenger p) (Method to book a seat)
cancelTicket(Passenger p) (Method to cancel a booking)

2️⃣ Passenger Class
Represents a train passenger.
name (String)
age (int)
ticketNumber (String) (Generated when booked)

3️⃣ BookingSystem Class
Manages train bookings and passenger details.
addTrain(Train t) (Add a new train to the system)
searchTrain(String trainNumber) (Find a train)
displayAvailableSeats(String trainNumber) (Check available seats)
bookTicket(String trainNumber, Passenger p) (Book a ticket)
cancelTicket(String trainNumber, Passenger p) (Cancel a ticket)

📌 Functional Requirements
✅ A user can search for a train using its train number.
✅ A passenger can book a ticket if seats are available.
✅ On booking, the available seats decrease.
✅ A passenger can cancel a ticket, and available seats increase.
✅ Show an error if booking is full or cancellation fails.

🛠️ Your Task
✅ Implement the Train, Passenger, and BookingSystem classes.
✅ Handle edge cases, like overbooking or canceling an unbooked ticket.
✅ Generate a unique ticket number for each passenger.

 */
package oops.class_object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q5_Train_Booking_System {
    public static void main(String[] args) {
        BookingSystem Bsystem = new BookingSystem();

        // Add trains
        Train t1 = new Train("12345", "Rajdhani Express", 100);
//        Train t2 = new Train("67890", "Shatabdi Express", 3);
        Bsystem.addTrain(t1);
//        system.addTrain(t2);

        // Passengers
        Passenger p1 = new Passenger("huzaifa", 24);
        Passenger p2 = new Passenger("huzz", 22);
//        Passenger p3 = new Passenger("Amit", 30);

        // Book Tickets
        Bsystem.bookTicket("12345", p1);
        Bsystem.bookTicket("12345", p2);
//        Bsystem.bookTicket("12345", p3);

        // Check availability
        Bsystem.displayAvailableSeats("12345");

        // Cancel Ticket
        Bsystem.cancelTicket("12345", p2);

        // Check availability after cancellation
        Bsystem.displayAvailableSeats("12345");

        // Try booking another ticket
        Passenger p4 = new Passenger("Sonia", 28);
        Bsystem.bookTicket("12345", p4);
    }
}

//train class
class Train {
    String trainNumber;
    String trainName;
    int totalSeats;
    int availableSeats;

    //constructor
    Train(String trainNumber, String trainName, int totalSeats){
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;  // Initially, all seats are available
    }
    //method to book seat
    boolean bookTicket(){
        if(availableSeats > 0){
            availableSeats --;
            return true;// booking successful
        }
        return false;//no seat left
    }
    //method to cancel ticket
    boolean cancelTicket(){
        if(availableSeats < totalSeats){
            availableSeats ++;
            return true; // Cancellation successful
        }
        return false;// No ticket to cancel
    }
}

//Passenger class
class Passenger{
    String name;
    int age;
    String ticketNumber;// Assigned when ticket is booked

    Passenger(String name,int age){
        this.name = name;
        this.age = age;
        this.ticketNumber = null;
    }

    //Method to assign ticket number
    void setTicketNumber(String ticketNumber){
        this.ticketNumber = ticketNumber;
    }
}

//booking system
class BookingSystem{
    List<Train> trains = new ArrayList<>();
    Map<String, Passenger> bookings = new HashMap<>(); //Map ticketNumber to Passenger

    // Add a train to the system
    void addTrain(Train train) {
        trains.add(train);
    }


    // Search for a train by number
    Train searchTrain(String trainNumber) {
        for (Train train : trains) {
            if (train.trainNumber.equals(trainNumber)) {
                return train;
            }
        }
        return null; // Train not found
    }

    // Book a ticket for a passenger
    void bookTicket(String trainNumber, Passenger passenger) {
        Train train = searchTrain(trainNumber);
        if (train != null && train.bookTicket()) {
            String ticketNumber = "TKT" + trainNumber + (bookings.size() + 1);
            passenger.setTicketNumber(ticketNumber);
            bookings.put(ticketNumber, passenger);
            System.out.println("🎉 Ticket booked! Ticket Number: " + ticketNumber);
        } else {
            System.out.println("🚫 Booking failed. No available seats.");
        }
    }

    // Cancel a booked ticket
    void cancelTicket(String trainNumber, Passenger passenger) {
        if (passenger.ticketNumber != null && bookings.containsKey(passenger.ticketNumber)) {
            Train train = searchTrain(trainNumber);
            if (train != null && train.cancelTicket()) {
                bookings.remove(passenger.ticketNumber);
                passenger.setTicketNumber(null);
                System.out.println("✅ Ticket cancelled successfully.");
            } else {
                System.out.println("🚫 Cancellation failed.");
            }
        } else {
            System.out.println("🚫 No valid ticket found for cancellation.");
        }
    }

    // Display available seats in a train
    void displayAvailableSeats(String trainNumber) {
        Train train = searchTrain(trainNumber);
        if (train != null) {
            System.out.println("🛤️ Train " + train.trainName + " (Train No: " + trainNumber + ") has " +
                    train.availableSeats + " seats available.");
        } else {
            System.out.println("🚫 Train not found.");
        }
    }
}

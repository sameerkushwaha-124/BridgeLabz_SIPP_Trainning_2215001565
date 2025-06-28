// Flight Booking System
// Scenario: Simulate a basic flight booking system where users can search flights, book them,
// and view booking details.
// Problem Requirements:
// ● Use Array to store available flight data.
// ● Store user bookings in a List.
// ● Use String operations to allow case-insensitive flight search.
// ● Use methods for searching, booking, and displaying bookings.
import java.util.*;

class User {
    int id;
    String name;
    String email;
    String src;
    String dest;

    User(int id, String name, String email, String src, String dest) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.src = src;
        this.dest = dest;
    }
}

public class FlightBookingSystem {
    static class AeroPlane {
        String flightNumber;
        String departure;
        String arrival;
        int availableSeats;

        AeroPlane(String flightNumber, String departure, String arrival, int availableSeats) {
            this.flightNumber = flightNumber;
            this.departure = departure;
            this.arrival = arrival;
            this.availableSeats = availableSeats;
        }
    };

    static class Booking {
        User user;
        AeroPlane flight;

        Booking(User user, AeroPlane flight) {
            this.user = user;
            this.flight = flight;
        }
    };

    public static void viewBookingDetails(User user, List<Booking> booking) {
        for (Booking booked : booking) {
            if (booked.user.id == user.id) {
                System.out.println("Booking Details: ");
                System.out.println("Name: " + booked.user.name);
                System.out.println("Email: " + booked.user.email);
                System.out.println("Flight Number: " + booked.flight.flightNumber);
                System.out.println("Departure: " + booked.flight.departure);
                System.out.println("Arrival: " + booked.flight.arrival);
                System.out.println("Available Seats: " + booked.flight.availableSeats);
            }
        }
    }

    public static void main(String args[]){
        FlightBookingSystem fbs = new FlightBookingSystem();


        AeroPlane[] flight = new AeroPlane[3];
        flight[0] = new AeroPlane("123", "Mumbai", "Chennai", 10);
        flight[1] = new AeroPlane("456", "Delhi", "Mumbai", 20);
        flight[2] = new AeroPlane("789", "Mumbai", "Chennai", 30);
        
        List<User> users  = new ArrayList<>();
        users.add(new User(1, "Sameer Kushwaha", "sameerkushwaha2003@gmail.com", "Mumbai", "Delhi"));
        users.add(new User(2, "Rahul", "rahul@gmail.com", "Delhi", "Mumbai"));
        users.add(new User(3, null, null, null, null));
        
        
        List<Booking> bookingDetails = new ArrayList<>();
        for(User u : users){{
            for(AeroPlane A : flight){
               if(A.departure.equals(u.src) && A.arrival.equals(u.dest) && A.availableSeats > 0){
                   bookingDetails.add(new Booking(u, A));
                   A.availableSeats--;
                }
            } 
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Id of the user: ");
        int id = sc.nextInt();
        for(User us : users){
            if(us.id == id){
                viewBookingDetails(u, bookingDetails);
            }
        }
    }
   }
}
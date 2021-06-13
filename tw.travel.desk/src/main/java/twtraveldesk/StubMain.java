package twtraveldesk;

import tw.travel.flights.createFlightBooking.FlightService;
import tw.travel.paymentsinterface.PaymentService;

import java.util.ServiceLoader;

public class StubMain {
    public static void main(String[] args) {
        System.out.println("Starting Booking");
        //At the travel desk we need all services to be available
        FlightService fls = new FlightService();

        //Discover interface implementations
        Iterable<PaymentService> services =
                ServiceLoader.load(PaymentService.class);

        String flightBookingId = fls.bookFlight();
        System.out.println("\nFlight booking id"+flightBookingId);
        String transactionId = services.iterator().next().pay();
        System.out.println("\nTransaction Id" + transactionId);

        System.out.println("\nEnding execution");
    }
}

package twtraveldesk;

import tw.travel.flights.Flights;

public class StubMain {
    public static void main(String[] args) {
        System.out.println("Starting Booking");
        Flights fls = new Flights();
        System.out.println(fls.createFlightBooking());
    }
}

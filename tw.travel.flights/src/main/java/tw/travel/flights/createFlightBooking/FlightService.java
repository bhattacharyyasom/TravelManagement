package tw.travel.flights.createFlightBooking;

import tw.travel.ValueObjects.FlightBookingId;

public class FlightService {
    public String bookFlight(){
      //Check validity of input
      //Create FlightBooking and emit flightbooking event
      //Take Id and persist the FlightBooking aggregate
      //Payment service listens for FlightBookingCreated event and
      CreateFlightBookingAggregate createFlightBookingAggregate = CreateFlightBookingAggregate.builder().build();
      String flightBookingId = createFlightBookingAggregate.getFlightBookingId();
      return "aflightBookingId";
    }
}

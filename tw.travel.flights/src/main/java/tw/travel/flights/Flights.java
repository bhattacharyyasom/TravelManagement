package tw.travel.flights;

import java.util.UUID;

public class Flights {
 public FlightBooking createFlightBooking(){
  return FlightBooking.builder().bookingId(UUID.randomUUID().toString()).tripId(UUID.randomUUID().toString()).build();
 }
}

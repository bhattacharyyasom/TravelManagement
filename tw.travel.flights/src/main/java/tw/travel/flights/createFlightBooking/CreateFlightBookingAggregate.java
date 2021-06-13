package tw.travel.flights.createFlightBooking;

import lombok.Builder;
import lombok.Value;
import tw.travel.ValueObjects.events.FlightBookingEvent;

//This is a aggregate that should maintain a transactional boundary of a flight booking
//Domain question to ask : What all "things" change when we create a flight booking
//eg. users profile can accumulate points etc however may not be absolutely necessary immediately
//
// We want to track the life of a flight booking. So that becomes our root entity.
//We add VOs as required to hold transient information

@Value
@Builder
public class CreateFlightBookingAggregate {
    String flightBookingId;
    FlightBooking flightBooking;

    CreateFlightBookingAggregate createFlightBooking() {
        //Insert validation logic
        CreateFlightBookingAggregate createFlightBookingAggregate = CreateFlightBookingAggregate.builder().build();
        emitEvent();
        return createFlightBookingAggregate;
    }

    public boolean isValid() {
        //TODO - Insert aggregate checks here
        flightBooking.validate();
        return true;
    }

    private FlightBookingEvent emitEvent() {
        //TODO Create a event out of this aggregate action
        return FlightBookingEvent.builder().build();
    }
}
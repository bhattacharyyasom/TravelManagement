package tw.travel.flights.createFlightBooking;

import lombok.Builder;
import lombok.Data;
import tw.travel.ValueObjects.PersonId;

@Builder
@Data
public class User {
    PersonId personId;
}

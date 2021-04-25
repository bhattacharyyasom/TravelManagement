package tw.travel.flights;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FlightBooking {
    private String bookingId;
    private String tripId;
}

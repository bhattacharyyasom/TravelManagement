package tw.travel.ValueObjects;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

// Domain class for FlightBookingId.
// TODO: Add validations here later.
@Value
public class FlightBookingId {
    String airlinesCode;
    String operatorCode;
    String randomId;

    private FlightBookingId(String airlinesCode, String operatorCode) {
        this.airlinesCode = airlinesCode;
        this.operatorCode = operatorCode;
        this.randomId = UUID.randomUUID().toString();
    }

    public static FlightBookingId getFlightBookingId(String airlinesCode, String operatorCode) {
        return new FlightBookingId(airlinesCode, operatorCode);
    }
}

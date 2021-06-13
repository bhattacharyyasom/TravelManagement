package tw.travel.ValueObjects.events;

import lombok.Builder;
import tw.travel.ValueObjects.FlightBookingId;
import tw.travel.ValueObjects.FlightLeg;
import tw.travel.ValueObjects.PersonId;
import tw.travel.ValueObjects.Price;
import tw.travel.ValueObjects.enumerations.PaymentMode;

import java.util.Date;
import java.util.List;
@Builder
public class FlightBookingEvent {
    String flightBookingId;
    String operatorId;
    String tripId;
    String personName;
    List<FlightLeg> legs;
    PaymentMode paymentMode;
    String bookingStatus;
    Date bookingDate;
    String fare;
    String transactionId;

}

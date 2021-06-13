package tw.travel.flights.createFlightBooking;

import lombok.Builder;
import lombok.Value;
import tw.travel.ValueObjects.FlightBookingId;
import tw.travel.ValueObjects.FlightLeg;
import tw.travel.ValueObjects.PersonId;
import tw.travel.ValueObjects.Price;
import tw.travel.ValueObjects.enumerations.PaymentMode;

import java.util.Date;
import java.util.List;

@Value
@Builder
public class FlightBooking {
    FlightBookingId flightBookingId;
    String operatorId;
    String tripId;
    PersonId person;
    List<FlightLeg> legs;
    PaymentMode paymentMode;
    String bookingStatus;
    Date bookingDate;
    Price fare;
    // String transactionId; Ignoring this as we want to take care of payment using eventual consistency. Consider later for view model

    FlightBooking modifyBooking() {
        return FlightBooking.builder().build();
    }

//FlightBooking completeBooking(){
//    Transaction c = new Transaction();
//    TransactionSummaryInvoice transactionSummaryInvoice= c.pay();
//    return FlightBooking.builder().transactionId(transactionSummaryInvoice.getTransactionId()).build();
//}

//TransactionSummaryInvoice getTransactionDetailsAgainstBooking(){
//    return new Transaction().getDetails(this.transactionId);
//}

    boolean validate() {
        return true;
    }

}
package tw.travel.flights;

import org.junit.jupiter.api.BeforeEach;
import tw.travel.ValueObjects.FlightBookingId;
import tw.travel.ValueObjects.FlightLeg;
import tw.travel.ValueObjects.Price;
import tw.travel.flights.createFlightBooking.FlightBooking;

import java.sql.Date;
import java.time.Instant;
import java.util.Collections;
import java.util.Currency;
import java.util.Locale;

class FlightBookingTest {

    private FlightBooking sut;

    @BeforeEach
    void setUp() {
        //TODO Continue building a FlightBooking here
        sut = FlightBooking.builder().flightBookingId(FlightBookingId.getFlightBookingId("QA", "IGO"))
                .bookingDate(Date.from(Instant.now())).bookingStatus("STARTED")
                .fare(new Price(12L, 25L, Currency.getInstance(Locale.getDefault())))
                .tripId("someTripId")
                .legs(Collections.singletonList(new FlightLeg("KOL","GER","VEG","12A","AISLE")))
                .build();
    }
}
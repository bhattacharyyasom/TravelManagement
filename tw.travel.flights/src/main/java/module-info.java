module tw.travel.flights {
    exports tw.travel.ValueObjects;
    exports tw.travel.flights.createFlightBooking;

    requires tw.travel.paymentsinterface;

    requires static lombok;//can be a static requires as we only need this at compile time6
    requires static java.sql;//can be a static requires as we only need this for testing
}
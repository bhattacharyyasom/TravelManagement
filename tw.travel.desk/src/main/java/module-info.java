module tw.travel.desk {
    requires tw.travel.flights;
    requires tw.travel.paymentsinterface;
    requires static lombok;  //can be a static requires as we only need this at compile time
    uses tw.travel.paymentsinterface.PaymentService;
}
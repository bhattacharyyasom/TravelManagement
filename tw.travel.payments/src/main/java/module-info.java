module tw.travel.payments {
    requires static lombok;//can be a static requires as we only need this at compile time
    requires tw.travel.paymentsinterface;

    exports tw.travel.payments;
    provides tw.travel.paymentsinterface.PaymentService with tw.travel.payments.PaymentServiceImpl;
}
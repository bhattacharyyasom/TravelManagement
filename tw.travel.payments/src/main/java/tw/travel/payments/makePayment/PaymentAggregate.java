package tw.travel.payments.makePayment;

//Implement everything related to payment transaction here
//Explore more VOs that can go here
public class PaymentAggregate {
    public Payment payment; //Root entity

    public boolean validatePayment(){
        return payment.validate();
    }
}

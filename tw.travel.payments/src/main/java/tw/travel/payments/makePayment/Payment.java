package tw.travel.payments.makePayment;

import lombok.Value;

@Value
class Payment {
    PersonInfo personInfo;
    String amount;
    String transactionType;
    boolean transactionStatus;
    boolean validate(){
        return true;
    }
}

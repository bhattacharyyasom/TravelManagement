package tw.travel.payments;

import tw.travel.paymentsinterface.PaymentService;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public String pay() {
        return "transactionId";
    }
}

package tw.travel.payments.makePayment;

import lombok.Value;

//Value Object
@Value
public class PersonInfo {
    UserInfo userInfo;
    Address shippingAddress;
    Address billingAddress;
}

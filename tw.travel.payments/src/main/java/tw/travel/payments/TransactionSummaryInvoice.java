package tw.travel.payments;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class TransactionSummaryInvoice {
    String transactionId;
    String merchantName;
    String customerName;
}

package tw.travel.payments;

public class Transaction {
    public TransactionSummaryInvoice pay() {
        return TransactionSummaryInvoice.builder().build();
    }

    public TransactionSummaryInvoice getDetails(String transactionId) {
        return TransactionSummaryInvoice.builder().transactionId(transactionId).build();
    }
}

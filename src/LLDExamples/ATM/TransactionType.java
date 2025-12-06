package LLDExamples.ATM;

public enum TransactionType {
    CASH_WITHDRAWAL,
    BALANCE_CHECK;

    public static void showTransactionTypes() {
        for (TransactionType transactionType : TransactionType.values()) {
            System.out.println(transactionType.name());
        }
    }
}

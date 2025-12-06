package LLDExamples.ATM;

public class Card {
    private int cardNumber;
    private int cvv;
    private int expiryDate;
    private String holderName;
    static int PIN = 111111;
    private BankAccount bankAccount;

    public boolean isPINCorrect(int pin) {
        return pin == PIN;
    }

    public int getBankBalance() {
        return bankAccount.balance;
    }

    public void deductMoney(int amount) {
        bankAccount.withdrawMoney(amount);
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}

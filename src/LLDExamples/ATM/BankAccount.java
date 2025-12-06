package LLDExamples.ATM;

public class BankAccount {
    int balance;

    public void withdrawMoney(int amount) {
        balance -= amount;
    }
}

package LLDExamples.ATM.ATMStates;

import LLDExamples.ATM.ATM;
import LLDExamples.ATM.Card;
import LLDExamples.ATM.TransactionType;

public abstract class ATMState {
    public void insertCard(ATM atm, Card card) {
        System.out.println("Something is wrong");
    }

    public void authenticatePIN(ATM atm, Card card, int pin) {
        System.out.println("Something is wrong");
    }

    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        System.out.println("Something is wrong");
    }

    public void cashWithdrawal(ATM atm, Card card, int withdrawalAmount) {
        System.out.println("Something is wrong");
    }

    public void displayBalance(ATM atm, Card card) {
        System.out.println("Something is wrong");
    }

    public void returnCard() {
        System.out.println("Something is wrong");
    }

    public void exit(ATM atm) {
        System.out.println("Something is wrong");
    }

}

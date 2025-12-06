package LLDExamples.ATM.ATMStates;

import LLDExamples.ATM.ATM;
import LLDExamples.ATM.Card;

public class CheckBalanceState extends ATMState {
    public CheckBalanceState() {
    }


    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setAtmState(new IdleState());
        System.out.println("Exiting");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Balance is: " + card.getBankBalance());
        exit(atm);
    }
}

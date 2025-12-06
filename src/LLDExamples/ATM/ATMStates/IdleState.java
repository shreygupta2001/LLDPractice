package LLDExamples.ATM.ATMStates;

import LLDExamples.ATM.ATM;
import LLDExamples.ATM.Card;

public class IdleState extends ATMState {
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card inserted");
        atm.setAtmState(new HasCardState());
    }
}

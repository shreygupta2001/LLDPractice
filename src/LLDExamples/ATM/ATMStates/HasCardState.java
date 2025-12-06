package LLDExamples.ATM.ATMStates;

import LLDExamples.ATM.ATM;
import LLDExamples.ATM.Card;

public class HasCardState extends ATMState{
    public HasCardState() {
        System.out.println("Enter Card pin");
    }

    @Override
    public void authenticatePIN(ATM atm, Card card, int pin) {
        boolean isCorrectPin = card.isPINCorrect(pin);

        if(isCorrectPin){
            atm.setAtmState(new SelectOperationState());
        }else{
            System.out.println("Invalid PIN");
            exit(atm);
        }
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
}

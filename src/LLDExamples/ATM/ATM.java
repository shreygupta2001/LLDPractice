package LLDExamples.ATM;

import LLDExamples.ATM.ATMStates.ATMState;
import LLDExamples.ATM.ATMStates.IdleState;

public class ATM {
    private static ATM atm = new ATM();
    ATMState atmState;
    private int atmBalance;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;

    public static ATM getAtm() {
        atm.setAtmState(new IdleState());
        return atm;
    }

    public static void setAtm(ATM atm) {
        ATM.atm = atm;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public void deductTwoThousandNotes(int number) {
        noOfTwoThousandNotes -= number;
    }

    public void deductFiveHundredNotes(int number) {
        noOfFiveHundredNotes -= number;
    }

    public void deductOneHundredNotes(int number) {
        noOfOneHundredNotes -= number;
    }

    public void deductATMBalance(int amount) {
        atmBalance -= amount;
    }
}

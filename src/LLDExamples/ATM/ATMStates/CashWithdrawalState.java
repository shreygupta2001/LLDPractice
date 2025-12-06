package LLDExamples.ATM.ATMStates;

import LLDExamples.ATM.ATM;
import LLDExamples.ATM.AmountWithdrawal.CashWithdrawProcessor;
import LLDExamples.ATM.AmountWithdrawal.FiveHundredWithdrawProcessor;
import LLDExamples.ATM.AmountWithdrawal.OneHundredWithdrawProcessor;
import LLDExamples.ATM.AmountWithdrawal.TwoThousandWithdrawProcessor;
import LLDExamples.ATM.Card;

public class CashWithdrawalState extends ATMState {
    public CashWithdrawalState() {
        System.out.println("Enter withdrawal Amount");
    }

    @Override
    public void cashWithdrawal(ATM atm, Card card, int withdrawalAmount) {
        if (atm.getAtmBalance() < withdrawalAmount) {
            System.out.println("Insufficient funds in the ATM");
            exit(atm);
        } else if (card.getBankBalance() < withdrawalAmount) {
            System.out.println("Insufficient funds in your bank account");
            exit(atm);
        } else {
            card.deductMoney(withdrawalAmount);
            atm.deductATMBalance(withdrawalAmount);

            CashWithdrawProcessor withdrawProcessor = new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));
            withdrawProcessor.withdraw(atm, withdrawalAmount);
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

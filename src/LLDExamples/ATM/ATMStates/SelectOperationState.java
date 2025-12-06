package LLDExamples.ATM.ATMStates;

import LLDExamples.ATM.ATM;
import LLDExamples.ATM.Card;
import LLDExamples.ATM.TransactionType;

public class SelectOperationState extends ATMState {
    public SelectOperationState() {
        showOperations();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        switch (transactionType) {
            case CASH_WITHDRAWAL:
                atm.setAtmState(new CashWithdrawalState());
                break;
            case BALANCE_CHECK:
                atm.setAtmState(new CheckBalanceState());
                break;
            default:
                System.out.println("Invalid Operation");
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

    public void showOperations() {
        System.out.println("Please select operation");
        TransactionType.showTransactionTypes();
    }
}

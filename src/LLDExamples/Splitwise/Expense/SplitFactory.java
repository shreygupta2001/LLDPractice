package LLDExamples.Splitwise.Expense;

import LLDExamples.Splitwise.Expense.Split.EqualExpenseSplit;
import LLDExamples.Splitwise.Expense.Split.ExpenseSplit;
import LLDExamples.Splitwise.Expense.Split.PercentageExpenseSplit;
import LLDExamples.Splitwise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {

        return switch (splitType) {
            case EQUAL -> new EqualExpenseSplit();
            case UNEQUAL -> new UnequalExpenseSplit();
            case PERCENTAGE -> new PercentageExpenseSplit();
            default -> null;
        };
    }
}

package seedu.expenditure;

import java.time.LocalDate;

public class FoodExpenditure extends Expenditure {
    public FoodExpenditure(String description, double value, LocalDate date) {
        super(description, value, date);
    }

    @Override
    public String toString() {
        return String.format("[Food] || %s", super.toString());
    }

    @Override
    public String getExpenditureType() {
        return "F";
    }

    @Override
    public String saveInfo() {
        return getExpenditureType() +
                "d/" + getDescription() +
                "v/" + getValue() +
                "t/" + getDate() +
                "p/" + "None" +
                "n/" + "None" +
                "o/" + "None" + "\n";
    }
}

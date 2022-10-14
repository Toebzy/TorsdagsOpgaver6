public class ChanceCard {
    private String text;
    private int expense;
    private int income;

    public ChanceCard(String text, int expense, int income) {
        this.text = text;
        this.expense = expense;
        this.income = income;
    }

    public String getText() {
        return text;
    }

    public int getExpense() {
        return expense;
    }

    public int getIncome() {
        return income;
    }

    @Override
    public String toString() {
        return "Chance card" + text;
    }
}

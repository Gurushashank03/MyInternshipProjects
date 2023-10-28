import java.util.ArrayList;
import java.util.List;

public class ExpenseTracker {
    private List<Expense> expenses = new ArrayList<>();

    // Methods for adding and retrieving expenses
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    // Add methods for expense summaries (e.g., total expenses for a specific category or time period)
}

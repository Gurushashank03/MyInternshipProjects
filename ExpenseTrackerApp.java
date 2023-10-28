import java.util.Scanner;

public class ExpenseTrackerApp {
    private static ExpenseTracker expenseTracker = new ExpenseTracker();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Expense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Expense Summaries");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    viewExpenses();
                    break;
                case 3:
                    // Implement expense summaries
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addExpense() {
        // Implement expense input and validation
    }

    private static void viewExpenses() {
        // Retrieve and display expenses
    }
}

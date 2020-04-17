package atm_machine;
/**
 * Provides a Screen class. Displays different menus based on operation.<br>
 * @author Muhammad Damanhuri
 */
public class Screen {
    /**
     * Displays menu template.
     */
    public static void printMenuTemplate(String title, String menu) {
        System.out.printf("%s%n%s%n%s%n%n%s", "=".repeat(title.length()), title, "=".repeat(title.length()), menu);
    }
    /**
     * In the screen class we have a DisplayMainMenu method that displays the main
     * menu of the ATM.<BR>
     * 1. Deposit <br>
     * 2. Withdraw <br>
     * 3. Transfer <br>
     * 4. View Balance <br>
     * 5. Return home <br>
     * 6. Exit <br>
     */
    public static void displayMainMenu() {
        String mainMenu = String.format(
                "What would you like to do today?%n%n1. %s%n2. %s%n3. %s%n4. %s%n5. %s%n6. %s%n%nENTER NUMBER: ",
                "Deposit", "Withdraw", "Transfer", "View Balance", "Return Home", "Exit");
        printMenuTemplate("MAIN MENU", mainMenu);
    }
    /**
     * The DisplayWelcome method will output the welcome message of the display
     * screen.
     */
    public static void displayWelcome() {
        printMenuTemplate("WELCOME", "Press Return Key to continue.\n");
    }
    /**
     * The DisplayWithdrawMenu method will output the withdrawal screen, and prompts
     * users to choose an option.
     */
    public static void displayWithdrawMenu() {
        printMenuTemplate("WITHDRAW", "Enter the amount you want to withdraw (enter 0 to cancel): $");
    }
    /**
     * The DepositMenu method will display the deposit screen, and prompts users to
     * choose an option.
     */
    public static void depositMenu() {
        printMenuTemplate("DEPOSIT", "Enter the amount you want to deposit (enter 0 to cancel): $");
    }
    /**
     * The ChooseAccountMenu method will prompt the user to choose an account to
     * perform actions upon.
     */
    public static void chooseAccountMenu() {
        String menu = String.format("Which account do you want to perform the operation on? (enter 0 to cancel)%n%n1. %s%n2. %s%n%nENTER NUMBER: ", 
                                    "Checking", "Savings");
        printMenuTemplate("CHOOSE ACCOUNT", menu);
    }
    /**
     * The TransferMoneyMenu will display options to transfer the money.
     */
    public static void transferMoneyMenu() {
        printMenuTemplate("TRANSFER", "Enter the amount you want to transfer (enter 0 to cancel): $");
    }
    /**
     * The last method, CheckBalanceMenu will display options to check balances.
     */
    public static void checkBalanceMoney() {
        printMenuTemplate("VIEW BALANCE", "Current Balance: $");
    }
}

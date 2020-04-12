package atm_machine;


public class Screen {
	/**
	 *  In the screen class we have a DisplayMainMenu method that displays the main menu of the ATM.<BR>
	 *  1. Deposit <br>
	 *  2. Withdraw <br>
	 *  3. Transfer <br>
	 *  4. View Balance <br>
	 *  5. Return home <br>
	 *  6. Exit <br>
	 */
	public static void displayMainMenu() {
		System.out.printf("MAIN MENU%nWhat would you like to do today?%n1. %s%n2. %s%n3. %s%n4. %s%n5. %s%n6. %s%nENTER NUMBER: ",
				"Deposit",
				"Withdraw",
				"Transfer",
				"View Balance",
				"Return Home",
				"Exit");
	}
	/**
	 * The DisplayWelcome method will output the welcome message of the display screen.
	 */
	public static void displayWelcome() {
		System.out.printf("Welcome to our ATM!%n%nEnter your card number and PIN to begin.%n");
	}
	/**
	 * The DisplayWithdrawMenu method will output the withdrawal screen, and prompts users to choose an option.
	 */
	public static void displayWithdrawMenu() {
		System.out.print("WITHDRAW\nEnter the amount you want to withdraw (enter 0 to cancel): $");
	}
	/**
	 * The DepositMenu method will display the deposit screen, and prompts users to choose an option.
	 */
	public static void depositMenu() {
		System.out.print("DEPOSIT\nEnter the amount you want to deposit (enter 0 to cancel): $");
	}
	/**
	 * The ChooseAccountMenu method will prompt the user to choose an account to perform actions upon.
	 */
	public static void chooseAccountMenu() {
		System.out.println("CHOOSE ACCOUNT\nWhich account do you want to perform the operation on? (enter 0 to cancel)");
	}
	/**
	 * The TransferMoneyMenu will display options to transfer the money.
	 */
	public static void transferMoneyMenu() {
		System.out.print("TRANSFER\nEnter the amount you want to transfer (enter 0 to cancel): $");
	}
	/**
	 * The last method, CheckBalanceMenu will display options to check balances. 
	 */
	public static void checkBalanceMoney() {
		System.out.println("VIEW BALANCE\nThis account has $");
	}
}



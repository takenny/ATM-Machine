package atm_machine;

import java.util.Scanner;
/**
 * 
 * @author Jose Gomez
 *
 */
public class ATM {
	private Bank myBank = new Bank();
	private Scanner cin = new Scanner(System.in);
	
	public ATM() {
	}
	//creates all the User Accounts
	//We may have to create a bank class if we want to save the changes
	/**
	 * Creates all the user Accounts. <br>
	 * We may have to create a bank class if we want to use the the "Serializable" interface to save the data.
	 */
	
	/**
	 * This is the ATM welcome Screen<br>
	 * This screen is displayed until there is user input.
	 */
	public void welcomeScreen() {
		//Screen.displayWelcome();
		//System.out.println("Welcome to bank. press any key to contine...");
		String choice = cin.nextLine();
		if(choice.equalsIgnoreCase("Q")) {}
		else {
			insertCard();
		}
	}
	/**
	 * This method prompts user to input pin card number (simulating inserting card and entering pin number).<br>
	 * If the user get it wrong 3 time, the ATM machine will return to the welcome screen.
	 */
	public void insertCard() {
		int tries = 0;
		String pin, cardNumber;
		boolean accountOpen = false;
		
		while(tries < 3) {
			pin = cin.nextLine();
			cardNumber = cin.nextLine();
		}
		if(openAccount != null) {
			mainMenu();
		}else {
			welcomeScreen();
		}*/
	}
	/**
	 * This is the main menu in the ATM Machine. It allow user to select from withdraw funds, deposit funds, transferFunds
	 * and view balance. The ATM will come back here after each action until the user decides to end their usage of the atm
	 * machine. When the user finishes it goes back to welcome screen.<br><br>
	 * There is also a quit option. Should it be hidden? ATM machines wouldn't normally turn off or end the program.
	 */
	public void mainMenu() {
		boolean quit = false;
		
		while(!quit) {
			//Screen.displayMainMenu();
			String choice = cin.nextLine();
			switch(choice) {
			case "1": //depositFunds(); break;
			case "2": //withdrawBalance(); break;
			case "3": //transferFunds(); break;
			case "4": //viewBalance(); break;
			case "5": //openAccount = null; quit = true; welcomeScreen(); break;
			case "6": //quit = true; break:
			default: System.out.println("Invalid Input");
			}
		}
	}
}

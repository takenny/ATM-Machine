package atm_machine;

/**
 * 
 * @author Kenny Ta 
 * 
 */
public class UserAccount {
	private static int counter = 0;
	BankAccount accounts[]=new BankAccount[2]; //This should be of type BankAccount -Jose
	private String accountNumber;
	private String accountPin;
	private String userName;
	
	/**
	 * Constructor for User account class
	 * @param userName 
	 * @param pin 
	 * @param ammountInChecking
	 * @param amountInSavings
	 */
	public UserAccount(String userName, String pin, double amountInChecking, double amountInSavings){
		this.setUserName(userName);
		accountPin = pin;
		generateAccountNumber();
		
		accounts[0] = new CheckingAccount(accountNumber + "0", amountInChecking);
		accounts[1] = new SavingsAccount(accountNumber + "1", amountInSavings);
	}
	/**
	 * Setter for pin number
	 * @param pin
	 */
	public void setPin(String pin) {
		accountPin = pin;
	}
	  /**
	   * getter for pin number
	   * @return pin number as a string
	   */
	public String getPin() {
		return accountPin;
	}
	/**
	 * Verifies that the pin number and card number are correct
	 * @param pin
	 * @param cardNumber
	 * @return true if the pin number and account number match, otherwise it returns false
	 */
	public boolean verifyPin(String pin, String cardNumber) {
		//System.out.println(pin + " " + accountPin + " " + cardNumber + " " + accountNumber);
		//System.out.println(pin.equals(accountPin) && accountNumber.equals(cardNumber));
		
		if(pin.equals(accountPin) && accountNumber.equals(cardNumber)) {
	      return true;
	    }
	    else {
	      return false;
	    }
	}
	/**
	 * Getter for a bank account.
	 * @param account should be either 0 or 1
	 * @return will return the savings account if the parameter is 1 or
	 */
	public BankAccount getAccount(int account){
		return accounts[account];
	}
	/**
	 * getter for userName
	 * @return user name
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * Setter for userName
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * Getter for AccountNumber <br>
	 * Mainly for testing purposes
	 * @return returns a string with the Account Number
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * Generates the AccountNumber
	 */
	private void generateAccountNumber() {
		accountNumber = "" + counter;
		while(accountNumber.length() < 5) {
			accountNumber = "0" + accountNumber;
		}
		counter++;
	}
}

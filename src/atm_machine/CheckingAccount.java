package atm_machine;

/**
 * 
 * @author Christian Pardo
 *
 */
public class CheckingAccount extends BankAccount{
	/**
	 * Constructor for Checking account
	 * @param number account number for checking account
	 * @param initialDeposit the amount in the account, when the account was started
	 */
	public CheckingAccount(String number, Double initialDeposit) { //changed number to string so it matches use account -Jose
		super(number, initialDeposit);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	@Override
	public boolean withdraw(double amount) {
		if(amount > balance) {
			return false;
		}
		else {
			balance -= amount;
			return true;
		}
	}
}

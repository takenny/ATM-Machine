package atm_machine;

/**
 * 
 * @author Christian Pardo
 *
 */
public class SavingsAccount extends BankAccount{
	private int monthlyWithdrawls;
	private long DateReset;
	
	/**
	 * Savings Account Constructor
	 * @param number account number
	 * @param initialDeposit the starting amount when the account is started
	 */
	public SavingsAccount(String number, Double initialDeposit) { //changed number to string so it matches use account -Jose
		super(number, initialDeposit);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Withdraw money from account.
	 * If it attempts to withdraw more than three times within a certian time period
	 * it will not allow it.
	 * @param amount amount being withdrawn from bank account
	 */
	@Override
	public boolean withdraw(double amount) {
		long CurrentMonth = System.currentTimeMillis()/(1000L * 60 * 60 * 24 * 30);
		if(CurrentMonth>DateReset) {
			DateReset = CurrentMonth;
			monthlyWithdrawls = 0;
		}
		
		if(monthlyWithdrawls<3) {
			monthlyWithdrawls+=1;
			balance-=amount;
			return true;
		}
		else {
			return false;
		}
	}
}

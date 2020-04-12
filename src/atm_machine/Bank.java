package atm_machine;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Vector;

public class Bank implements Serializable{ //we can implement Serializable to save changes
	private Vector<UserAccount> accounts = new Vector<UserAccount>();
	private UserAccount openAccount = null;
	/**
	 * Constructor for Bank. It initializes the bank accounts.
	 */
	public Bank() {
		initAccounts();
	}
	/**
	 * Creates the bank accounts
	 */
	public void initAccounts() {
		accounts.add(new UserAccount("ChrisP","7433", 400,2000));
		accounts.add(new UserAccount("jigom117", "3972", 2000, 176));
		accounts.add(new UserAccount("kta779", "9326", 43, 3000));
		accounts.add(new UserAccount("Muhammed", "9275", 4366.45, 100000.00));
	}
	
	public boolean accessAccount(String pin, String cardNumber) {			
		Iterator<UserAccount> it = accounts.iterator();
					
		while(it.hasNext()) {
			UserAccount temp = it.next();
			if(temp.verifyPin(pin, cardNumber)) {
				openAccount = temp;
				return true;
			}
		}
		return false;	
	}
	
	//withdraw money method
	
	//deposit money method
	
	
}

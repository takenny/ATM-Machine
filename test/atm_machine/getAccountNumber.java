package atm_machine;

import static org.junit.Assert.*;
import org.junit.Test;

public class getAccountNumber {

	UserAccount myAccount = new UserAccount("Test", "1234", 400, 300);
	UserAccount myAccount1 = new UserAccount("Test2", "1235", 400, 300);
	
	
	@Test
	public void testGetAccountNumber() {
		System.out.println(myAccount.getAccountNumber() + " " + myAccount1.getAccountNumber());
		assertEquals("00001", myAccount1.getAccountNumber());
	}

}

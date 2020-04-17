package atm_machine;

import static org.junit.Assert.*;

import org.junit.Test;

public class bypassStuff {
	Bank myBank = new Bank();
	boolean open = myBank.accessAccount("7433", "00000");
	
	
	@Test
	public void test() {
		myBank.viewBalance(0);
	}

}

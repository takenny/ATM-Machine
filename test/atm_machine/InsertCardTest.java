package atm_machine;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertCardTest {
	ATM myAtm = new ATM();
	
	/*@Test
	public void TestQuitCommand() {
		myAtm.insertCard();
	}*/
	//for some reason its not going to welcome screen after cancel
	@Test
	public void TestWelcomeScreen() {
		myAtm.welcomeScreen();
	}

}

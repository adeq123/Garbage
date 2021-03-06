package banking;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	Account account;
	@Before
	public void setUp(){
		account = new Account("John", 4300);
	}
	
	@Test
	public void withdrawTest() {
		account.withdraw(1350);
	assertEquals(2950,account.getBalance(),0);
		
	}
	
	@Test
	public void testGetHolder() {
	    assertNotNull(account.getHolder());
	}
}

package testcases;



import org.testng.annotations.Test;

import pages.PulseLogin;

public class TC_PulseLogin {
	
	@Test
	public static void TC_login() {
		
		try {
			PulseLogin.pulselogin();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	
	
	
	  
	 }
	
}
